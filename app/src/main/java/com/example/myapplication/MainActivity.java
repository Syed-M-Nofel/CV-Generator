package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText name,email,phone;
    String str1, str2,str3;
    Button submit;
    Spinner degree,skills,exp;

    ArrayList<String> list1=new ArrayList<>();
    ArrayList<String> list2=new ArrayList<>();
    ArrayList<String> list3=new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit=(Button)findViewById(R.id.submit);

        Intent i=new Intent(MainActivity.this,activity2.class);

        name=findViewById(R.id.editTextTextPersonName);
        email=findViewById(R.id.editTextTextEmailAddress2);
        phone=findViewById(R.id.editTextPhone);

        degree=findViewById(R.id.degreespinner);
        skills=findViewById(R.id.skillsspinner);
        exp=findViewById(R.id.expspinner);

        list1.add("Computer Science");
        list1.add("Cyber Security");
        list1.add("Machine Learning");
        list1.add("Data Science");

        list2.add("Android developer");
        list2.add("Web Developer");
        list2.add("ML Specialist");
        list2.add("Forensics");

        list3.add("10");
        list3.add("5");
        list3.add("2");
        list3.add("0");

        ArrayAdapter<String> adapter1=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,list1);
        degree.setAdapter(adapter1);
        ArrayAdapter<String> adapter2=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,list2);
        skills.setAdapter(adapter2);
        ArrayAdapter<String> adapter3=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,list3);
        exp.setAdapter(adapter3);


        degree.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (Objects.equals(exp.getSelectedItem(), "Computer Science")) {
                    str1 = String.valueOf("Computer Science");
                }
                if (Objects.equals(exp.getSelectedItem(), "Cyber Security")) {
                    str1 = String.valueOf("Cyber Security");
                }
                if (Objects.equals(exp.getSelectedItem(), "Machine Learning")) {
                    str1 = String.valueOf("Machine Learning");
                }
                if (Objects.equals(exp.getSelectedItem(), "Data Science")) {
                    str1 = String.valueOf("Data Science");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





        skills.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (Objects.equals(exp.getSelectedItem(), "Android developer")) {
                    str2 = String.valueOf("Android developer");
                }
                if (Objects.equals(exp.getSelectedItem(), "Web Developer")) {
                    str2 = String.valueOf("Web Developer");
                }
                if (Objects.equals(exp.getSelectedItem(), "ML Specialist")) {
                    str2 = String.valueOf("ML Specialist");
                }
                if (Objects.equals(exp.getSelectedItem(), "Forensics")) {
                    str2 = String.valueOf("Forensics");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        exp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (Objects.equals(exp.getSelectedItem(), "10")) {
                    str3 = String.valueOf(10);
                }
                if (Objects.equals(exp.getSelectedItem(), "5")) {
                    str3 = String.valueOf(5);
                }
                if (Objects.equals(exp.getSelectedItem(), "2")) {
                    str3 = String.valueOf(2);
                }
                if (Objects.equals(exp.getSelectedItem(), "0")) {
                    str3 = String.valueOf(0);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        submit.setOnClickListener(new View.OnClickListener()
        {
           @Override
           public void onClick(View view){
               i.putExtra("NAME",name.getText().toString());
               i.putExtra("EMAIL",email.getText().toString());
               i.putExtra("PHONE",phone.getText().toString());
               i.putExtra("DEGREE",String.valueOf(degree));
               i.putExtra("SKILLS",String.valueOf(skills));
               i.putExtra("EXPERIENCE",String.valueOf(exp));
               startActivity(i);
           }
        });
    }
}


