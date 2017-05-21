package com.example.cchiv.belot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int sumA = 0;
    int sumB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setTextA(View view) {
        EditText T = (EditText) findViewById(R.id.numberA);
        TextView textViewGameHistoryA = (TextView) findViewById(R.id.gameHistoryA);
        TextView textViewTextTotalA = (TextView) findViewById(R.id.textTotalA);
        textViewGameHistoryA.setVisibility(View.VISIBLE);
        textViewTextTotalA.setVisibility(View.VISIBLE);
        String text = T.getText().toString();
        if (!text.isEmpty()) {
            int score = Integer.parseInt(text);
            setTotalA(score);
        }
        T.setText(null);
    }

    public void setTextB(View view) {
        EditText T = (EditText) findViewById(R.id.numberB);
        TextView textViewGameHistoryB = (TextView) findViewById(R.id.gameHistoryB);
        TextView textViewTextTotalB = (TextView) findViewById(R.id.textTotalB);
        textViewGameHistoryB.setVisibility(View.VISIBLE);
        textViewTextTotalB.setVisibility(View.VISIBLE);
        String text = T.getText().toString();
        if (!text.isEmpty()) {
            int score = Integer.parseInt(text);
            setTotalB(score);
        }
        T.setText(null);
    }

    public void reset(View view) {
        sumA = 0;
        sumB = 0;
        String newText = "TOTAL: 0p";
        TextView TA = (TextView) findViewById(R.id.textTotalA);
        TA.setText(newText);
        TextView TB = (TextView) findViewById(R.id.textTotalB);
        TB.setText(newText);
        TextView HA = (TextView) findViewById(R.id.gameHistoryA);
        HA.setText(null);
        TextView HB = (TextView) findViewById(R.id.gameHistoryB);
        HB.setText(null);
    }

    public void setTotalA(int number) {
        TextView T = (TextView) findViewById(R.id.textTotalA);
        TextView H = (TextView) findViewById(R.id.gameHistoryA);
        sumA += number;
        String newText = "TOTAL: " + sumA + "p";
        T.setText(newText);
        String newHistoryEntry = H.getText().toString() + number + " ";
        H.setText(newHistoryEntry);
    }

    public void setTotalB(int number) {
        TextView T = (TextView) findViewById(R.id.textTotalB);
        TextView H = (TextView) findViewById(R.id.gameHistoryB);
        sumB += number;
        String newText = "TOTAL: " + sumB + "p";
        T.setText(newText);
        String newHistoryEntry = H.getText().toString() + number + " ";
        H.setText(newHistoryEntry);
    }
}
