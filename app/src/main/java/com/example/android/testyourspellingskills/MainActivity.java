package com.example.android.testyourspellingskills;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Start_Quiz(View view){
        EditText Entername = (EditText) findViewById(R.id.Enter_name);
        String EnterYourName = Entername.getText().toString();

        Intent intent = new Intent(MainActivity.this, QuizActivity.class);
        intent.putExtra("EXTRA_ENTERNAME", EnterYourName);
        startActivity(intent);
    }
}
