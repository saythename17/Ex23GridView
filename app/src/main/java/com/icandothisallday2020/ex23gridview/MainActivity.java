package com.icandothisallday2020.ex23gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayAdapter adapter;
    ArrayList<String> datas= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        //대량의 데이터
        datas.add("A"); datas.add("B"); datas.add("C");
        datas.add("D"); datas.add("E"); datas.add("F");
        datas.add("G"); datas.add("H"); datas.add("I");
        datas.add("J"); datas.add("K");
        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,datas);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
