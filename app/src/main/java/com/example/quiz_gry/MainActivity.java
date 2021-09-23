package com.example.quiz_gry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private TextView pytania;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pytania=findViewById(R.id.pytanie);
    }
    public void help(View view) {

        String tresc=pytania.getText().toString();

        Intent intent = new Intent(this,ActivityHelp.class);

        intent.putExtra("wiadomosc",tresc);

        startActivity(intent);



    }
    public void sprawdz(View view) {
        RadioGroup radiogroup =(RadioGroup) findViewById(R.id.radiogroup);
        int wybrany=radiogroup.getCheckedRadioButtonId();
        if (wybrany == R.id.radioButton3){
            Toast.makeText(this,R.string.gratulacje,Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this,R.string.zla_odp,Toast.LENGTH_SHORT).show();
        }


    }


}