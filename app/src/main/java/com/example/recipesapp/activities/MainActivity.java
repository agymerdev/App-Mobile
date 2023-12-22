package com.example.appcongthucnauan2023.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.GridView;

import com.example.appcongthucnauan2023.R;
import com.example.appcongthucnauan2023.adapter.CustomAdapter;
import com.example.appcongthucnauan2023.model.Constant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int condition;
    Intent intent;

    GridView gridView;
    CustomAdapter customAdapter;
    List<Constant>constantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridView);
        constantList=new ArrayList<>();

        intent=getIntent();
        condition=intent.getIntExtra("condition",00);

        if (condition == 1)
        {
            monMan();
        }
        else if(condition == 2)
        {
            monChay();
        }


        customAdapter = new CustomAdapter(MainActivity.this,constantList,condition);
        gridView.setAdapter(customAdapter);



    }


    void monChay()
    {
        constantList.add(new Constant(R.drawable.chay_1,getResources().getString(R.string.tc1),getResources().getString(R.string.inc1),getResources().getString(R.string.imc1)));
        constantList.add(new Constant(R.drawable.chay_2,getResources().getString(R.string.tc2),getResources().getString(R.string.inc2),getResources().getString(R.string.imc2)));
        constantList.add(new Constant(R.drawable.chay_3,getResources().getString(R.string.tc3),getResources().getString(R.string.inc3),getResources().getString(R.string.imc3)));
        constantList.add(new Constant(R.drawable.chay_4,getResources().getString(R.string.tc4),getResources().getString(R.string.inc4),getResources().getString(R.string.imc4)));
        constantList.add(new Constant(R.drawable.chay_5,getResources().getString(R.string.tc5),getResources().getString(R.string.inc5),getResources().getString(R.string.imc5)));

    }
    private void monMan() {

        constantList.add(new Constant(R.drawable.man_1,getResources().getString(R.string.t1),getResources().getString(R.string.in1),getResources().getString(R.string.im1)));
        constantList.add(new Constant(R.drawable.man_2,getResources().getString(R.string.t2),getResources().getString(R.string.in2),getResources().getString(R.string.im2)));
        constantList.add(new Constant(R.drawable.man_3,getResources().getString(R.string.t3),getResources().getString(R.string.in3),getResources().getString(R.string.im3)));
        constantList.add(new Constant(R.drawable.man_4,getResources().getString(R.string.t4),getResources().getString(R.string.in4),getResources().getString(R.string.im4)));
        constantList.add(new Constant(R.drawable.man_5,getResources().getString(R.string.t5),getResources().getString(R.string.in5),getResources().getString(R.string.im5)));

    }

}