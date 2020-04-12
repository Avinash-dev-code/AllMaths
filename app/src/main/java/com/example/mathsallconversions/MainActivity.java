package com.example.mathsallconversions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.FontsContract;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        String[] maths={"Maths Formulas","Maths Equations","Meter Convention","Kilometer conversion","Maths Tricks","Maths Theorem","Calculator","Algebra","Geometry","Log table","Logics","Statistics","Probability","Important maths concepts"};
        recyclerView.setAdapter(new MathAdapter(maths));

    }
}
