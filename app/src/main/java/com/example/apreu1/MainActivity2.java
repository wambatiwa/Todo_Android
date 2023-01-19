package com.example.apreu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    EditText titre = (EditText) findViewById(R.id.titre);
    EditText date = (EditText) findViewById(R.id.date);
    EditText heure = (EditText) findViewById(R.id.hour);
    EditText salle = (EditText) findViewById(R.id.place);
    EditText email = (EditText) findViewById(R.id.user);
    ImageView enrg = (ImageView) findViewById(R.id.register);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void enregistrer(View v) {


    }

}