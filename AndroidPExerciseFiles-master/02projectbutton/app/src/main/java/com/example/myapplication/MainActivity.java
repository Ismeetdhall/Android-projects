package com.example.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

//    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button= findViewById(R.id.mybtn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("TEST","clicked 1");
//            }
//        });

        // button=findViewById(R.id.mybtn2);
        //  button.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //   public void onClick(View v) {
        //        Log.d("test","clicked 2");
        //   }

        // });


    }

    public void bluePressed(View view) {
//        Log.d("blue", "clicked by method");
//
//        Context context = getApplicationContext();
//        CharSequence text = "hello from blue";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
        Toast.makeText(this,"hello from blue - Shorter",Toast.LENGTH_SHORT).show();


    }

    public void redPress(View view) {
//            Log.d("red","clicked2 by method");

//        Context context1 = getApplicationContext();
//        CharSequence text1 = "hello from red";
//        int duration1 = Toast.LENGTH_SHORT;
//
//        Toast toast1 = Toast.makeText(context1, text1, duration1);
//        toast1.show();
        Toast.makeText(this,"hello from red - Shorter",Toast.LENGTH_SHORT).show();


    }

}