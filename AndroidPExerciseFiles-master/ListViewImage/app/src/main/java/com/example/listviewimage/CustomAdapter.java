package com.example.listviewimage;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listviewimage.R;

import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String flower_list[];
    int  flowers[];
    LayoutInflater inflater;
    public CustomAdapter(Context applicationContext,String[]flower_list,int[]flowers){
        this.context=context;
        this.flower_list=flower_list;
        this.flowers=flowers;
        inflater=(LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return flower_list.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.activity_main2,null);
        TextView text=(TextView)view.findViewById(R.id.textView);
        CircleImageView image = view.findViewById(R.id.imgView);
        text.setText(flower_list[i]);
        image.setImageResource(flowers[i]);
        return view;


    }
}
