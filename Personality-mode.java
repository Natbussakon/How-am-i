package com.example.howamiapplication;
//เรียกใช้คำสั่งจาก library
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class javabg01 extends Activity {
//กำหนดตัวเก็บค่าในแต่ล่ะข้อ
    public static final String EXTRA_SCORE ="com.example.application.example.EXTRA_SCORE";
//กำหนดตัวแปรมารับค่า
    private int point = 0 ;
    private String score ="";
//กำหนดตัวแปรและค่าเริ่มต้น
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bg1);//เชื่อมหน้าโค้ดกับหน้า design XML

//ส่วนของโค้ดในเลือกคำตอบและเก็บคะแนนไว้ในแต่ล่ะข้อ

        
b1 = (Button) findViewById(R.id.button4); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(javabg01.this,javabg02.class);//เชื่อมจากหน้าbg01 ไป bg02
                point = point+4;
                score += Integer.toString(point);//แปลงค่าจากINT เป็นSTRING แล้วก็เอาตัวแปรscore มารับ
                b1.putExtra(EXTRA_SCORE,score); //ส่งค่าออกไป
                startActivity(b1);
            }
        });
        b2 = (Button) findViewById(R.id.button5); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2 = new Intent(javabg01.this,javabg02.class);//เชื่อมจากหน้าbg01 ไป bg02
                point = point+3;
                score += Integer.toString(point);//แปลงค่าจากINT เป็นSTRING แล้วก็เอาตัวแปรscore มารับ
                b2.putExtra(EXTRA_SCORE,score); //ส่งค่าออกไป
                startActivity(b2);
            }
        });
        b3 = (Button) findViewById(R.id.button6); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b3 = new Intent(javabg01.this,javabg02.class);//เชื่อมจากหน้าbg01 ไป bg02
                point = point+2;
                score += Integer.toString(point); //แปลงค่าจากINT เป็นSTRING แล้วก็เอาตัวแปรscore มารับ
                b3.putExtra(EXTRA_SCORE,score); //ส่งค่าออกไป
                startActivity(b3);
            }
        });
        b4 = (Button) findViewById(R.id.button7); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b4 = new Intent(javabg01.this,javabg02.class);//เชื่อมจากหน้าbg01 ไป bg02
                point = point+1;
                score += Integer.toString(point); //แปลงค่าจากINT เป็นSTRING แล้วก็เอาตัวแปรscore มารับ
                b4.putExtra(EXTRA_SCORE,score); //ส่งค่าออกไป
                startActivity(b4);
            }
        });
    }
}
