package com.example.journalapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
   // Widegets
    Button loginBtn,createAccountBtn;
    private EditText emailEt,passEt;
    //Firebase Auth
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createAccountBtn = findViewById(R.id.create_account);
        createAccountBtn.setOnClickListener(v ->  {
            //Onclick()
            Intent i =new Intent(MainActivity.this,SignUpActivity.class);
            startActivity(i);
        });
        // Login
        loginBtn=findViewById(R.id.email_signin);
        emailEt=findViewById(R.id.email);
        passEt=findViewById(R.id.password);


        // Firebase Authentication
        firebaseAuth=FirebaseAuth.getInstance();
        loginBtn.setOnClickListener(v-> {
            logEmailPassUser(
                    emailEt.getText().toString().trim(),
                    passEt.getText().toString().trim()
            );

        });
    }
    //    private void logEmailPassUser(
//            String email,String pwd
//    ){
//        //Checking  for empty texts
//        if(!TextUtils.isEmpty(email)
//        && !TextUtils.isEmpty(pwd)
//        ){
//            firebaseAuth.signInWithEmailAndPassword(
//                    email,pwd
//            ).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                @Override
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    FirebaseUser user=firebaseAuth.getCurrentUser();
//                    Intent i=new Intent(MainActivity.this,JournalListActivity.class);
//                    startActivity(i);
//                }
//            });
//        }
//
//    }
    // using the create account use the login button
    private void logEmailPassUser(
            String email,String pwd
    ){
        //Checking  for empty texts
        if(!TextUtils.isEmpty(email)
                && !TextUtils.isEmpty(pwd)
        ){
            firebaseAuth.signInWithEmailAndPassword(
                    email,pwd
            ).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                @Override
                public void onSuccess(AuthResult authResult) {
                    FirebaseUser user=firebaseAuth.getCurrentUser();
                    Intent i=new Intent(MainActivity.this,JournalListActivity.class);
                    startActivity(i);
                }
            });
        }
    }
}