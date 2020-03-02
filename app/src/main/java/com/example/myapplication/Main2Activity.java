package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listview=(ListView)findViewById(R.id.listvdata);
        final ArrayList<String> arraylist=new ArrayList<>();
        arraylist.add("iphone");
        arraylist.add("android");
        arraylist.add("bluckberry");
        arraylist.add("linux");
        arraylist.add("windows");
        ArrayAdapter arrayadapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arraylist);
        listview.setAdapter(arrayadapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
                }
        });
           }


    }

