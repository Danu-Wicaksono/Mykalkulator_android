package com.example.mykalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    //mendeklarsikan listview var
    private ListView lvItem;
    private String[] namanegara = new String[] {
            "Indonesia", "Malaysia", "Singapore", "Italia", "Inggris", "Belanda",
            "Argentina", "Chile", "Mesir", "Uganda"};
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        getSupportActionBar().setTitle("ListView Sederhana"); //tampil judul

        //memformat data
        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        //menset data dalam listview
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "Memilih : "+namanegara[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}