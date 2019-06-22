package com.berkanaslan.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView)findViewById(R.id.textView2);

        Intent intent = getIntent();
        String username = intent.getStringExtra("userInput");
        textView.setText("Name: "+username);
    }

    public void changeScreen(View view) {
        Intent intent = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);

    }
}
