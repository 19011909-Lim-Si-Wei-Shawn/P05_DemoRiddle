package sg.edu.rp.c346.id19011909.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    //Creating Variable,
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        //Linking Variable,
        tvAnswer = findViewById(R.id.textView2);

        //Setting Intent,
        Intent Intents = getIntent();
        String Selection = Intents.getStringExtra("Question");
        tvAnswer.setText(Selection + " answer is: Gone");

    }
}