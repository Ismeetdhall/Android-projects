package com.example.customgradle;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){
        switch(view.getId()){
            case R.id.errorButton:
                Toasty.error(this,"login failed", Toasty.LENGTH_SHORT).show();
                break;

            case R.id.successButton:
                Toasty.success(this,"login done", Toasty.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this,"oppssS", Toasty.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this,"upload image", Toasty.LENGTH_SHORT, ContextCompat.getDrawable(this,R.drawable.ic_cloud)).show();
                break;
            case R.id.infoButton:
                Toasty.info(this,"enter information", Toasty.LENGTH_SHORT).show();
                break;
        }

    }
}
