package com.example.shivam.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] indian_states=this.getResources().getStringArray(R.array.india_states);
        final ArrayList<String> stringArrayList=new ArrayList<>(Arrays.asList(indian_states));
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,stringArrayList);

        ListView l1=(ListView)findViewById(R.id.listview);

        l1.setAdapter(arrayAdapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),stringArrayList.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
