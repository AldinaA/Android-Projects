package com.example.passobjecttosecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = this.getIntent();
        Member myMember = (Member) intent.getSerializableExtra("MyMember");

        TextView tv1 = (TextView)  findViewById(R.id.fullName);
        tv1.setText(tv1.getText() + " " + myMember.fullName);
        TextView tv2 = (TextView)  findViewById(R.id.genderTV);
        tv2.setText(tv2.getText() + " " + myMember.gender);
        TextView tv3 = (TextView)  findViewById(R.id.currentWeightTV);
        tv3.setText(tv3.getText() + " " + myMember.currentWeight);
        TextView tv4 = (TextView)  findViewById(R.id.heightTV);
        tv4.setText(tv4.getText() + " " + myMember.height);
        TextView tv5 = (TextView)  findViewById(R.id.GoalWeightTV);
        tv5.setText(tv5.getText() + " " + myMember.goalWeight);
        TextView tv6 = (TextView)  findViewById(R.id.ageTV);
        tv6.setText(tv6.getText() + " " + myMember.age);
        TextView tv7 = (TextView)  findViewById(R.id.phoneTV);
        tv7.setText(tv7.getText() + " " + myMember.phone);
        TextView tv8 = (TextView)  findViewById(R.id.adressTV);
        tv8.setText(tv8.getText() + " " + myMember.adress);
        TextView tv9 = (TextView)  findViewById(R.id.checkedTV);
        tv9.setText(tv9.getText() + " " + myMember.terms);
    }
}