package com.example.quiz_gry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Intent intent = getIntent();

        String tekst=intent.getStringExtra("wiadomosc");

        TextView textView=(TextView) findViewById(R.id.pytanie);
        textView.setText(tekst);

    }
}