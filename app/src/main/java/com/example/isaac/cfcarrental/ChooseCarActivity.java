package com.example.isaac.cfcarrental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.isaac.cfcarrental.Adapters.SelectCarAdapter;
import com.example.isaac.cfcarrental.Adapters.SelectCarHolder;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

public class ChooseCarActivity extends AppCompatActivity {

    private List<SelectCarHolder> namesFD;
    private DatabaseReference clientNameDB;
    private SelectCarAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private DatabaseReference mDB;
    private int iterate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_car);



        mRecyclerView = findViewById(R.id.recyclerViewSelectCar);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));



        namesFD = new ArrayList<>();

        namesFD.add(new SelectCarHolder("323man", "5","10",
                "ford", "1","10", "disel"));

        namesFD.add(new SelectCarHolder("777 qwe", "15","70",
                "ford", "1","10", "disel"));

        namesFD.add(new SelectCarHolder("090 klk", "5","10",
                "Toyota", "1","10", "Petrol"));
        namesFD.add(new SelectCarHolder("323man", "5","10",
                "ford", "1","10", "disel"));
        namesFD.add(new SelectCarHolder("323man", "5","10",
                "Nisan", "1","10", "disel"));
        namesFD.add(new SelectCarHolder("323man", "5","10",
                "ford", "1","10", "disel"));
        namesFD.add(new SelectCarHolder("323man", "5","10",
                "Bat Mobil", "1","10", "disel"));
        namesFD.add(new SelectCarHolder("bat man", "5","10",
                "ford", "1","10", "disel"));


        mAdapter = new SelectCarAdapter(ChooseCarActivity.this, namesFD);

        mRecyclerView.setAdapter(mAdapter);




    }
}
