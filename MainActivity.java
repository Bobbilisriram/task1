package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      TextView tv;
      int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.t1);
        Button b=findViewById(R.id.b1);
        count=0;
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(count==0)
               {
                   tv.setText("one");
                   count++;
               }
               else if(count==1) {

                   tv.setText("two");
                   count--;
               }


           }
       });




    }

    }




