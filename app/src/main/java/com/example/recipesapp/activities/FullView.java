package com.example.appcongthucnauan2023.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appcongthucnauan2023.R;

public class FullView extends AppCompatActivity {


    Intent intent;
    String title;
    String ingredient;
    String implementationstep;
    int image;
    int condition;



    TextView titleTxt,ingredientTitle,ingredientTxt,implementationstepTitle,implementationstepTxt;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);


        titleTxt=(TextView)findViewById(R.id.titleFullView);
        ingredientTitle=(TextView)findViewById(R.id.ingredientTitle);
        ingredientTxt=(TextView)findViewById(R.id.ingredient);
        implementationstepTitle=(TextView)findViewById(R.id.implementationstepTitle);
        implementationstepTxt=(TextView)findViewById(R.id.implementationstep);
        imageView=(ImageView)findViewById(R.id.thumbnailFullView);


        intent=getIntent();

        image=intent.getIntExtra("image",00);
        condition=intent.getIntExtra("condition",00);
        title=intent.getStringExtra("title");
        ingredient=intent.getStringExtra("ingredient");
        implementationstep=intent.getStringExtra("implementationstep");


        Toast.makeText(FullView.this,title,Toast.LENGTH_LONG).show();

        if (condition==1)
        {
            ingredientTitle.setGravity(Gravity.RIGHT);
            ingredientTxt.setGravity(Gravity.RIGHT);
            implementationstepTitle.setGravity(Gravity.RIGHT);
            implementationstepTxt.setGravity(Gravity.RIGHT);


            ingredientTitle .setText(": Nguyên Liệu");
            implementationstepTitle.setText(": Thực Hiện");
        }

        else if (condition==2)
        {
            ingredientTitle.setGravity(Gravity.LEFT);
            ingredientTxt.setGravity(Gravity.LEFT);
            implementationstepTitle.setGravity(Gravity.LEFT);
            implementationstepTxt.setGravity(Gravity.LEFT);
            ingredientTitle .setText(": Nguyên Liệu");
            implementationstepTitle.setText(": Thực Hiện");
        }

        imageView.setImageResource(image);

        titleTxt.setText(title);
        ingredientTxt.setText(ingredient);
        implementationstepTxt.setText(implementationstep);


    }
}