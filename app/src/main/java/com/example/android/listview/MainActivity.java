package com.example.android.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items= new ArrayList<>();
        for(int i= 0; i< 50; i++)
            items.add("item"+ i);

        Integer[] thumbs={R.drawable.an, R.drawable.rose};

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, R.layout.simple_list_layout, R.id.textView, items);
        ArrayAdapter<Integer> adapter1= new ArrayAdapter<>(this, R.layout.simple_list_layout, R.id.imageview, thumbs);

        ListView listView= findViewById(R.id.list);

//        listView.setAdapter(adapter);
        listView.setAdapter(adapter1);
    }
}