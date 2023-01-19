package com.example.apreu1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String reunions[] = {"Reunions 1", "Reunions 2", "Reunion 3", "Reunion 4", "Reunion 5"};
    String heures[] = {"- 7h30","- 8h30","- 9h30","- 10h30","-11h30"};
    String salles[] = {"- salle red","- salle maroon","- salle yellow","- salle lime","- salle green"};
    String mails[] = {"janvier@gmail.com","tiwa@gmail.com","jan@gmail.com","enero@gmail.com","wambyjanv@gmail.com"};
    reunion r = new reunion(reunions,heures,salles,mails);
    int fruitImages[] = {R.drawable.dark, R.drawable.yellow, R.drawable.orange, R.drawable.dark, R.drawable.dark};
    int delete[] = {R.drawable.delete};
    int add [] = {R.drawable.plus};


    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.customListView);
        CustomListAdapter adapt = new CustomListAdapter(getApplicationContext(), r.reunions, fruitImages,delete,r.salles,r.heures,r.mails,add);
        l.setAdapter(adapt);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                String selectedItem = (String) adapterView.getItemAtPosition(pos);
                Toast.makeText(MainActivity.this, "Item" + (pos + 1) + ":" + selectedItem, Toast.LENGTH_LONG).show();
            }
        });

    }

}
