package com.example.firelogin;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText editText;

    EditText password;
    Button button,b2,b3;


    private FirebaseAuth mAuth;

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        Toast.makeText(this,"Already in",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);


        mAuth = FirebaseAuth.getInstance();
    }

    public void onRegister(View view){
        final String myemail = email.getText().toString();
        final String mypass = password.getText().toString();

        String em = email.getText().toString();
        String pass =password.getText().toString();


        if(em.isEmpty()){
            email.setError("email is required");
            return;
        }
        if (pass.isEmpty()) {
            password.setError("password is required");
            return;
        }

        mAuth.createUserWithEmailAndPassword(myemail,mypass)

                .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                    @Override

                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.i("TAG", "createUserWithEmail:success");
                            Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.d("Error-app",task.getException().getMessage());
                            Toast.makeText(MainActivity.this, "Failure",Toast.LENGTH_SHORT).show();


                        }

                        // ...
                    }
                });

    }
    public void onLogin(View view){

        final String myemail = email.getText().toString();
        final String mypass = password.getText().toString();

        String em = email.getText().toString();
        String pass =password.getText().toString();

        if(em.isEmpty()){
            email.setError("email is required");
            return;
        }
        if (pass.isEmpty()) {
            password.setError("password is required");
            return;
        }


        mAuth.signInWithEmailAndPassword(myemail, mypass)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.i("Tag", "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            String userID = user.getUid().toString();
                            Toast.makeText(MainActivity.this,"Auth Success",Toast.LENGTH_SHORT).show();

                            Log.i("User","User:" + user.toString());
                            Log.i("User","User:" + userID);



                        } else {
                            // If sign in fails, display a message to the user.
                            Log.i("Tag", "signInWithEmail:failure", task.getException());
                            Toast.makeText(MainActivity.this,"Auth failure",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


    public void onLogout(View view){
        FirebaseAuth.getInstance().signOut();
        Toast.makeText(MainActivity.this,"Signout",Toast.LENGTH_SHORT).show();
    }

}
