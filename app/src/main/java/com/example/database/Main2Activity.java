package com.example.database;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    public void upload(View view)
    {
        Intent intent=new Intent(Main2Activity.this,Upload_activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Bundle bundle=getIntent().getExtras();
//        String username = bundle.getString("email");
//        Toast.makeText(Main2Activity.this,username,Toast.LENGTH_LONG).show();

    }
}
