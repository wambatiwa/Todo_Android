package com.example.apreu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CustomListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

    }


    public void ajouter(View v) {
        Intent act2 = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(act2);
    }

}