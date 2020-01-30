package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int balls = 0;
    int strikes = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button strikeButton = findViewById(R.id.strikeBtn);
        Button ballButton = findViewById(R.id.ballBtn);
        Button resetButton = findViewById(R.id.reset);
        Button exitButton = findViewById(R.id.exit);

        strikeButton.setOnClickListener(this);
        ballButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        TextView strikeT = findViewById(R.id.strikeCnt);
        TextView ballsT = findViewById(R.id.ballCnt);
        switch (v.getId()){

            case R.id.strikeBtn:
                strikes = strikes + 1;
                strikeT.setText(""+strikes);
                break;

            case R.id.ballBtn:
                balls = balls + 1;
                ballsT.setText(""+balls);
                break;

            case R.id.reset:
                balls = 0;
                strikes = 0;
                ballsT.setText("0");
                strikeT.setText("0");
                break;

            case R.id.exit:
                finish();
                break;

        }

    }
}
