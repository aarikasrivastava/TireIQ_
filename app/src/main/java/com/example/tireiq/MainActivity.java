package com.example.tireiq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewStub stubGrid;
    private ViewStub stubList;
    private ListView listView;
    private GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tyre_list);

        stubGrid=(ViewStub)findViewById(R.id.stub_grid) ;
        stubList=(ViewStub)findViewById(R.id.stub_list);
        stubList.inflate();
        stubGrid.inflate();
       SharedPreferences sharedPreferences=getSharedPreferences("ViewMode", MODE_PRIVATE);



        ArrayList<Tyre> tyres = new ArrayList<Tyre>();
        ArrayList<Tyreg> tyresg = new ArrayList<Tyreg>();
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 1"));
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 2"));
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 3"));
        tyres.add(new Tyre(R.drawable.logo72, "Tyre 4"));

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter( new TyreAdapter(this, tyres, R.color.orange));
        tyresg.add(new Tyreg(R.drawable.logo72, "Tyre 1"));
        tyresg.add(new Tyreg(R.drawable.logo72, "Tyre 2"));
        tyresg.add(new Tyreg(R.drawable.logo72, "Tyre 3"));
        tyresg.add(new Tyreg(R.drawable.logo72, "Tyre 4"));
        GridView gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter( new TyregAdapter(this, tyresg, R.color.orange));



    }




}
