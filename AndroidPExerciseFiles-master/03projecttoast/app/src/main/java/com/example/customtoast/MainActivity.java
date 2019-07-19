package com.example.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void image (View view) {
//        Toast.makeText(this, "okk", Toast.LENGTH_SHORT).show();
        showcustomtoast();

    }

    public void showcustomtoast(){
        LayoutInflater inflater = getLayoutInflater();
        View layout=inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.toast_root));


        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();

    }
}
