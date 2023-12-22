package com.example.appcongthucnauan2023.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.appcongthucnauan2023.R;

public class Dashboard extends AppCompatActivity {

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }

        this.finishAffinity();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void ViewAll(View view) {

        Intent intent = new Intent(Dashboard.this,MainActivity.class);

        switch (view.getId())
        {
            case R.id.monMan:
                intent.putExtra("condition",1);
                break;
            case R.id.monChay:
                intent.putExtra("condition",2);
                break;

        }

        startActivity(intent);

    }
}