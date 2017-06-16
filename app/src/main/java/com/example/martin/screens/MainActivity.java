package com.example.martin.screens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ingresar(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void ingresardos(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void ingresardostres(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

    public void ingresardostres2(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }



    public void ingresardostre(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }



}
