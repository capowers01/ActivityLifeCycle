package com.chrispow.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ShowGuess extends AppCompatActivity {
    private TextView showGuessTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_guess);

        //Grabs everything spelled out in intent.putExtra fields
        Bundle extra = getIntent().getExtras();

        showGuessTextView = findViewById(R.id.received_textView);

        if (extra != null){
            showGuessTextView.setText(extra.getString("guess"));
            Log.d("extra", "onCreate: " + extra.getString("name"));
            Log.d("extra 2", "onCreate: " + extra.getInt("age"));

        }

        showGuessTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.putExtra("message_back", "From second activity");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
//
//        if (getIntent().getStringExtra("guess") != null){
//            showGuessTextView.setText(getIntent().getStringExtra("guess"));
//        }


    }
}