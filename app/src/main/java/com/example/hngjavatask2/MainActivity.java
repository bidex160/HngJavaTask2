package com.example.hngjavatask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<String> strings = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.list);
        strings.add("**LIKES**");
        strings.add("food");
        strings.add("Pes");
        strings.add("coding");
        strings.add("Reading");
        strings.add("**DISLIKES**");
        strings.add("Alcohol");
        strings.add("Chewing Gum");
        strings.add("**HOBBIES**");
        strings.add("Coding");
        strings.add("Watching Football");


        listview.setAdapter(new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, strings));

    }
}
