package com.example.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    public void details(View view)
    {
        Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
        startActivity(intent);
    }
    public void material(View view)
    {
        Intent intent=new Intent(Main3Activity.this,Selectsem.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}
