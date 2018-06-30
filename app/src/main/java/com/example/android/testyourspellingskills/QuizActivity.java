
package com.example.android.testyourspellingskills;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.Gravity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.TextView;
        import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    public static final String TAG = QuizActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Intent intent = getIntent();
        String EnterYourName = intent.getStringExtra("EXTRA_ENTERNAME");
        TextView textview = findViewById(R.id.PlayerName);
        textview.setText(EnterYourName);
//        Button btnGrade = (Button)findViewById(R.id.Grade_Quiz);
//        btnGrade.setOnClickListener(new View.OnClickListener(){

    }

    int score = 0;

    public void Grade_Quiz(View view) {

        RadioButton questionOneAnswer = (RadioButton) findViewById(R.id.radio_BO);
        if (questionOneAnswer.isChecked()){
            score++;
        }

        //figure out if the user checked Excede
        CheckBox questionTwoAnswerA = (CheckBox) findViewById(R.id.checkbox_Excede);
        if (questionTwoAnswerA.isChecked()){
            score++;
        }

        CheckBox questionTwoAnswerB = (CheckBox) findViewById(R.id.checkbox_Suceed);
        if (questionTwoAnswerB.isChecked()){
            score++;
        }

        RadioButton questionThreeAnswer = (RadioButton) findViewById(R.id.radio_Chilled);
        if (questionThreeAnswer.isChecked()){
            score++;
        }

        //figure out if the user entered their answer for question 4
        EditText questionFourAnswer = (EditText) findViewById(R.id.Question4_answer);
        String EnterYourAnswer = questionFourAnswer.getText().toString();
        if (EnterYourAnswer == "Minute") {
            score++;
        }

        RadioButton questionFiveAnswer = (RadioButton) findViewById(R.id.radio_Perfume);
        if (questionFiveAnswer.isChecked()){
            score++;
        }

        RadioButton questionSixAnswer = (RadioButton) findViewById(R.id.radio_Hear);
        if (questionSixAnswer.isChecked()){
            score++;
        }

        RadioButton questionSevenAnswer = (RadioButton) findViewById(R.id.radio_Naturally);
        if (questionSevenAnswer.isChecked()){
            score++;
        }

        RadioButton questionEightAnswer = (RadioButton) findViewById(R.id.radio_Perplexing);
        if (questionEightAnswer.isChecked()){
            score++;
        }

        RadioButton questionNineAnswer = (RadioButton) findViewById(R.id.radio_Phonograph);
        if (questionNineAnswer.isChecked()){
            score++;
        }

        RadioButton questionTenAnswer = (RadioButton)findViewById(R.id.radio_Flagellate);
        if (questionTenAnswer.isChecked()){
            score++;
        }

        displayResult();

    }

    private void displayResult() {
        String message = "You scored " + score;
        message += " out of 10";
        message += "\nWell done!";
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        score = 0;
    }


//    private int calculateScore ( boolean CheckExcede, boolean CheckInterceed , boolean CheckProceed, boolean Suceed) {
//
//        if (CheckExcede = true ){
//            score = score + 0;
//        }
//    }

//
  public void Try_again(View view){

    super.onStart();
    setContentView(R.layout.activity_quiz);

    }
}
