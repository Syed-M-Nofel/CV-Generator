package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    TextView name,email,phone,degree,skills,exp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i=getIntent();

        name=findViewById(R.id.textView7);
        phone=findViewById(R.id.textView15);
        email=findViewById(R.id.textView16);
        degree=findViewById(R.id.textView24);
        skills=findViewById(R.id.textView25);
        exp=findViewById(R.id.textView26);

        name.setText(i.getStringExtra("NAME"));
        phone.setText(i.getStringExtra("PHONE"));
        email.setText(i.getStringExtra("EMAIL"));
        degree.setText(i.getStringExtra("DEGREE"));
        skills.setText(i.getStringExtra("SKILLS"));
        exp.setText(i.getStringExtra("EXPERIENCE"));


    }
}