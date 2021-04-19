package com.example.howamiapplication;
//เรียกใช้คำสั่งจาก library
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class javasm01 extends Activity {
//กำหนดตัวแปรมารับค่า
    Button b1;
    Button b2;
    Button b3;
    Button b4;
//กำหนดตัวเก็บค่าในแต่ล่ะข้อ
    public static final String EXTRA_SCORE ="com.example.application.example.EXTRA_SCORE";
    public static final String EXTRA_SCORE2 ="com.example.application.example.EXTRA_SCORE";

    private  int point2 = 0 ;
    private String score2 ="";
//กำหนดตัวแปรและค่าเริ่มต้น

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sm1);
        final Intent intent = getIntent();

//ส่วนของโค้ดในเลือกคำตอบและเก็บคะแนนไว้ในแต่ล่ะข้อ

        b1 = (Button) findViewById(R.id.button4); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(javasm01.this,javasm02.class);//เชื่อมจากหน้าsm01 ไป sm02
                point2 += point2;
                score2 += Integer.toString(point2); //แปลงค่าจากINTเป็นSTRINGแล้วเอาตัวแปรscore มารับ
                b1.putExtra(EXTRA_SCORE2,score2);
                startActivity(b1);
                finish();
            }
        });
        b2 = (Button) findViewById(R.id.button5); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2 = new Intent(javasm01.this,javasm02.class);//เชื่อมจากหน้าsm01 ไป sm02
                point2 = point2+1;
                score2 += Integer.toString(point2); //แปลงค่าจากINTเป็นSTRINGแล้วเอาตัวแปรscore มารับ
                b2.putExtra(EXTRA_SCORE2,score2); //ส่งค่าออกไป
                startActivity(b2);
                finish();
            }
        });
        b3 = (Button) findViewById(R.id.button6); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b3 = new Intent(javasm01.this,javasm02.class); //เชื่อมจากหน้าsm01 ไป sm02
                point2 = point2+2;
                score2 += Integer.toString(point2); //แปลงค่าจากINTเป็นSTRINGแล้วเอาตัวแปรscore มารับ
                //a +="2";
                b3.putExtra(EXTRA_SCORE2,score2); //ส่งค่าออกไป
                startActivity(b3);
                finish();
            }
        });
        b4 = (Button) findViewById(R.id.button7); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b4 = new Intent(javasm01.this,javasm02.class); //เชื่อมจากหน้าsm01 ไป sm02
                point2 = point2+3;
                score2 += Integer.toString(point2); //แปลงค่าจากINTเป็นSTRINGแล้วเอาตัวแปรscore มารับ
                //a +="3";
                b4.putExtra(EXTRA_SCORE2,score2); //ส่งค่าออกไป
                startActivity(b4);
                finish();
            }
        });
    }
}
