package com.example.presencesystem;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ListOnlineViewHolder extends RecyclerView.ViewHolder {
    public TextView txtEmail;
    public ListOnlineViewHolder(View itemView){
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);
    }
}
