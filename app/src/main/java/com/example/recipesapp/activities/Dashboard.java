package com.example.recipesapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.recipesapp.R;

public class Dashboard extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAndRemoveTask();
        this.finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
}