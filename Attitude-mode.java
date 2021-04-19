package com.example.howamiapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class javaat01 extends Activity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;

@Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.at1);

        b1 = (Button) findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(javaat01.this,javaattans11.class);
                startActivity(b1);
            }
        });
b2 = (Button) findViewById(R.id.button10);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2 = new Intent(javaat01.this,javaattans12.class);
                startActivity(b2);
            }
        });
        b3 = (Button) findViewById(R.id.button11);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b3 =new Intent(javaat01.this,javaattans13.class);
                startActivity(b3);
            }
        });
        b4 = (Button) findViewById(R.id.button12);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b4 = new Intent(javaat01.this,javaattans14.class);
                startActivity(b4);
            }
        });
    }
}
package com.example.howamiapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class javaattans13 extends Activity {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atans13);

        b1 = (Button) findViewById(R.id.button14);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1 = new Intent(javaattans13.this,javaat02.class);
                startActivity(b1);
            }
        });

    }
}
