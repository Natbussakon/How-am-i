package com.example.howamiapplication;
//เรียงใช้คำสั่งจาก library
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class javaresult extends Activity {
//เป็นตัวรับค่าจาก พาร์ท1 และ พาร์ท2เพื่อมารวมคะแนน
    public static final String EXTRA_SCORE ="com.example.application.example.EXTRA_SCORE";
    public static final String EXTRA_SCORE2="com.example.application.example.EXTRA_SCORE";
    private  int point_last = 0;
    private  int point_last2 = 0 ; //กำหนดตัวแปรและค่าเริ่มต้น
    Button b1 ;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        final Intent intent = getIntent(); //กำหนดตัวแปร Intent ชื่อ intent ให้รับค่าและไม่สามารถแก้ไขได้ชื่อได้
        int score_last11 = Integer.parseInt(intent.getStringExtra(javasm01.EXTRA_SCORE2)); //score_last11มารับค่าของEXTRA_SCORE2จากหน้าjavasm01 
        point_last2 += score_last11;//point_last2 //นำมาเก็บค่าscore_last11
        int score_last12 = Integer.parseInt(intent.getStringExtra(javasm02.EXTRA_SCORE2));
//score_last12มารับค่าของEXTRA_SCORE2จากหน้าjavasm02
        point_last2 += score_last12; //point_last2 //นำมาเก็บค่าscore_last12
        int score_last13 = Integer.parseInt(intent.getStringExtra(javasm03.EXTRA_SCORE2));
//score_last13มารับค่าของEXTRA_SCORE2จากหน้าjavasm03
        point_last2 += score_last13; //point_last2 //นำมาเก็บค่าscore_last13
        int score_last14 = Integer.parseInt(intent.getStringExtra(javasm04.EXTRA_SCORE2));
//score_last14มารับค่าของEXTRA_SCORE2จากหน้าjavasm04
        point_last2 += score_last14; //point_last2 //นำมาเก็บค่าscore_last14
        int score_last15 = Integer.parseInt(intent.getStringExtra(javasm05.EXTRA_SCORE2));
//score_last15มารับค่าของEXTRA_SCORE2จากหน้าjavasm05
        point_last2 += score_last15; //point_last2 //นำมาเก็บค่าscore_last15
        int score_last16 = Integer.parseInt(intent.getStringExtra(javasm06.EXTRA_SCORE2));
//score_last16มารับค่าของEXTRA_SCORE2จากหน้าjavasm06
        point_last2 += score_last16; //point_last2 //นำมาเก็บค่าscore_last16
        int score_last17 = Integer.parseInt(intent.getStringExtra(javasm07.EXTRA_SCORE2));
//score_last17มารับค่าของEXTRA_SCORE2จากหน้าjavasm07
        point_last2 += score_last17; //point_last2 //นำมาเก็บค่าscore_last17
        int score_last18 = Integer.parseInt(intent.getStringExtra(javasm08.EXTRA_SCORE2));
//score_last18มารับค่าของEXTRA_SCORE2จากหน้าjavasm08
        point_last2 += score_last18; //point_last2 //นำมาเก็บค่าscore_last18
        int score_last19 = Integer.parseInt(intent.getStringExtra(javasm09.EXTRA_SCORE2));
//score_last19มารับค่าของEXTRA_SCORE2จากหน้าjavasm09
        point_last2 += score_last19; //point_last2 //นำมาเก็บค่าscore_last19
        //score9 = intent.getStringExtra(javasm09.EXTRA_SCORE2);

        int score_last1 = Integer.parseInt(intent.getStringExtra(javabg01.EXTRA_SCORE));
//score_last1มารับค่าของEXTRA_SCOREจากหน้าjavabg01
        point_last += score_last1; //point_last //นำมาเก็บค่าscore_last1
        int score_last2 = Integer.parseInt(intent.getStringExtra(javabg02.EXTRA_SCORE));
//score_last2มารับค่าของEXTRA_SCOREจากหน้าjavabg02
        point_last += score_last2; //point_last //นำมาเก็บค่าscore_last2
        int score_last3 = Integer.parseInt(intent.getStringExtra(javabg03.EXTRA_SCORE));
//score_last3มารับค่าของEXTRA_SCOREจากหน้าjavabg03
        point_last += score_last3; //point_last //นำมาเก็บค่าscore_last3
        int score_last4 = Integer.parseInt(intent.getStringExtra(javabg04.EXTRA_SCORE));
//score_last4มารับค่าของEXTRA_SCOREจากหน้าjavabg04
        point_last += score_last4; //point_last //นำมาเก็บค่าscore_last4
        int score_last5 = Integer.parseInt(intent.getStringExtra(javabg05.EXTRA_SCORE));
//score_last5มารับค่าของEXTRA_SCOREจากหน้าjavabg05
        point_last += score_last5; //point_last //นำมาเก็บค่าscore_last5
        int score_last6 = Integer.parseInt(intent.getStringExtra(javabg06.EXTRA_SCORE));
//score_last6มารับค่าของEXTRA_SCOREจากหน้าjavabg06
        point_last += score_last6; //point_last //นำมาเก็บค่าscore_last6
        int score_last7 = Integer.parseInt(intent.getStringExtra(javabg07.EXTRA_SCORE));
//score_last7มารับค่าของEXTRA_SCOREจากหน้าjavabg07
        point_last += score_last7; //point_last //นำมาเก็บค่าscore_last7
        int score_last8 = Integer.parseInt(intent.getStringExtra(javabg08.EXTRA_SCORE));
//score_last8มารับค่าของEXTRA_SCOREจากหน้าjavabg08
        point_last += score_last8; //point_last //นำมาเก็บค่าscore_last8
        int score_last9 = Integer.parseInt(intent.getStringExtra(javabg09.EXTRA_SCORE));
//score_last9มารับค่าของEXTRA_SCOREจากหน้าjavabg09
        point_last += score_last9; //point_last //นำมาเก็บค่าscore_last9


       b1 = (Button) findViewById(R.id.button44); //เชื่อมโค้ดกับตัวปุ่มให้สามารถคลิกได้
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
//ในส่วนนี้คือการนำค่าของ พาร์ทแรกและพาร์ทสองมาเช็คเงื่อนไขถ้าเข้าเงื่อนไขก็เชื่อมไปต่อยังผลเฉลยต่อไป            
public void onClick(View v) {
                if (point_last<=18&&point_last2<=7){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2<=7
                    Intent b1 = new Intent(javaresult.this,javaansb1.class); 
//เชื่อมจากหน้าresult ไป ansb1
                    startActivity(b1);
                    finish();
                }
                if (point_last<=18&&(point_last2>=8&&point_last2<=12)){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2>=8และpoint_last2<=12
                    Intent b1 = new Intent(javaresult.this,javaansb2.class); 
//เชื่อมจากหน้าresult ไป ansb2

                    startActivity(b1);
                    finish();
                }
                if (point_last<=18&&(point_last2>=13&&point_last2<=18)){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2>=13และpoint_last2<=18
                    Intent b1 = new Intent(javaresult.this,javaansb3.class); 
//เชื่อมจากหน้าresult ไป ansb3

                    startActivity(b1);
                    finish();
                }
                if (point_last<=18&&point_last2>=19){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2>=19
                    Intent b1 = new Intent(javaresult.this,javaansb4.class);
//เชื่อมจากหน้าresult ไป ansb4
                    startActivity(b1);
                    finish();
                }
                if (point_last>=18&&point_last2<=7){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2>=7
                    Intent b1 = new Intent(javaresult.this,javaansa1.class);
//เชื่อมจากหน้าresult ไป ansa1
                    startActivity(b1);
                    finish();
                }
                if (point_last>=18&&(point_last2>=8&&point_last2<=12)){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2>=8และpoint_last2<=12
                    Intent b1 = new Intent(javaresult.this,javaansa2.class);
//เชื่อมจากหน้าresult ไป ansa2
                    startActivity(b1);
                    finish();
                }
                if (point_last>=18&&(point_last2>=13&&point_last2<=18)){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2>=13และpoint_last2<=18
                    Intent b1 = new Intent(javaresult.this,javaansa3.class);
//เชื่อมจากหน้าresult ไป ansa3
                    startActivity(b1);
                    finish();
                }
                if (point_last>=18&&point_last2>=19){
//กรณีที่point_lastมีคะแนน<=18และpoint_last2>=19 
                    Intent b1 = new Intent(javaresult.this,javaansa4.class);
//เชื่อมจากหน้าresult ไป ansa4
                    startActivity(b1);
                    finish();
                }
            }
        });
    }
}
