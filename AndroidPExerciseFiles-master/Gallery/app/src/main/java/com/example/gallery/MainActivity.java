package com.example.gallery;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    CustomGalleryAdapter customGalleryAdapter;
    //array of images
    int[]images = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gallery g = (Gallery)findViewById(R.id.gallery);
        imageView = (ImageView) findViewById(R.id.imageView);

        //initialize the adapter
        customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(),images);
        g.setAdapter(customGalleryAdapter); //set the adapter

        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"image" + position,Toast.LENGTH_SHORT).show();
                imageView.setImageResource(images[position])
                ;
            }
        });
    }


}
