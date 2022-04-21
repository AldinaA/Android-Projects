package com.example.passprimitivedatatosecondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    String gender ="";
    String fullName="";
    String currentWeight="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nameEditText = (EditText) findViewById(R.id.names);
        EditText currentWeightEditText = (EditText) findViewById(R.id.current_weight);
        EditText heightEditText = (EditText) findViewById(R.id.height);
        EditText goalWeightEditText = (EditText) findViewById(R.id.goal_weight);
        EditText ageEditText = (EditText) findViewById(R.id.age);
        EditText phoneEditText = (EditText) findViewById(R.id.Phone);
        EditText addressEditText = (EditText) findViewById(R.id.address);
        CheckBox conditionsCheckBox = (CheckBox) findViewById(R.id.conditions);




        View submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener()
                                  {
                                      public void onClick(View v)
                                      {

                                          fullName = nameEditText.getText().toString();
                                          currentWeight = currentWeightEditText.getText().toString();
                                          String GoalWeight = goalWeightEditText.getText().toString();
                                          String age = ageEditText.getText().toString();
                                          String phone = phoneEditText.getText().toString();
                                          String address = addressEditText.getText().toString();
                                          String Height = heightEditText.getText().toString();
                                          Boolean checkBoxState = conditionsCheckBox.isChecked();
                                          Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                                          Bundle mBundle = new Bundle();
                                          mBundle.putString("Link1", fullName);
                                          mBundle.putString("Link2", currentWeight);
                                          mBundle.putString("Link3", GoalWeight);
                                          mBundle.putString("Link4", age);
                                          mBundle.putString("Link5", phone);
                                          mBundle.putString("Link6", address);
                                          mBundle.putString("Link7", Height);
                                          mBundle.putString("Link8", String.valueOf(checkBoxState));
                                          mBundle.putString("Link9", gender);

                                          mIntent.putExtras(mBundle);
                                          startActivity(mIntent);




                                      }
                                  }
        );
    }

    public void radioButtonhandler(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.radioButton:
                if (checked)
                {
                    gender="M";
                }
                break;

            case R.id.female:
                if (checked)
                {
                    gender="F";
                }
                break;
            case R.id.other:
                if (checked)
                {
                    gender="Other";
                }
        }
        // Decide what happens when a user clicks on a button
    }



}