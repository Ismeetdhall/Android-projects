package com.example.fireusersystem;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference rootRef = db.getReference();
    DatabaseReference userRef = rootRef.child("Users");

    EditText username,name,email;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username);
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myUsername = username.getText().toString().trim();
                String myName = name.getText().toString().trim();
                String myEmail = email.getText().toString().trim();

                String em = email.getText().toString();
                String nam =name.getText().toString();
                String user = username.getText().toString();


                if(em.isEmpty()){
                    email.setError("email is required");
                    return;
                }
                if (nam.isEmpty()) {
                    name.setError("name is required");
                    return;
                }

                    if (user.isEmpty()) {
                        username.setError("username is required");
                        return;
                }

                HashMap<String,String>userMap = new HashMap<String, String>();
                userMap.put("Username",myUsername);
                userMap.put("Name",myName);
                userMap.put("Email",myEmail);

                userRef.push().setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this,"Failure",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
