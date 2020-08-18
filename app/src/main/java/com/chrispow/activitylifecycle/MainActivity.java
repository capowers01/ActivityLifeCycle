package com.chrispow.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showGuess;
    private EditText enterGuess;
    private final int REQUEST_CODE = 2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showGuess = findViewById(R.id.button_guess);

        enterGuess = findViewById(R.id.guess_field);

        showGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String guess = enterGuess.getText().toString().trim();

                if (!guess.isEmpty()) {
                    //Connect first screen to the second one
                    Intent intent = new Intent(MainActivity.this, ShowGuess.class);
                    intent.putExtra("guess", guess);
                    intent.putExtra("name", "Bond");
                    intent.putExtra("age", 34);

                    startActivityForResult(intent, REQUEST_CODE);

                    //startActivity(intent);
                    //Below is another way different than the line above...
                    //startActivity(new Intent(MainActivity.this, ShowGuess.class));
                }else {
                    Toast.makeText(MainActivity.this, "Enter guess",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE){

            assert data != null;
            String message = data.getStringExtra("message_back");
                Toast.makeText(MainActivity.this, message,
                        Toast.LENGTH_SHORT)
                        .show();

        }
    }

//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("Cycle", "onStart: ");
//        Toast.makeText(MainActivity.this, "onStart() called",
//                Toast.LENGTH_SHORT)
//                .show();
//    }
//
//    @Override
//    protected void onPostResume() {
//        super.onPostResume();
//        Log.d("Cycle", "onPostResume: ");
//        Toast.makeText(MainActivity.this, "onPostResume() called",
//                Toast.LENGTH_SHORT)
//                .show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("Cycle", "onPause: ");
//        Toast.makeText(MainActivity.this, "onPause() called",
//                Toast.LENGTH_SHORT)
//                .show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("Cycle", "onStop: ");
//        Toast.makeText(MainActivity.this, "onStop() called",
//                Toast.LENGTH_SHORT)
//                .show();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("Cycle", "onDestroy: ");
//        Toast.makeText(MainActivity.this, "onDestroy() called",
//                Toast.LENGTH_SHORT)
//                .show();
//    }
}