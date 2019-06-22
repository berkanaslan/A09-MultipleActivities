package com.berkanaslan.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String username;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = "";
        editText = (EditText)findViewById(R.id.editText);
    }

    public void changeActivity(View view) {
        username = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);

        intent.putExtra("userInput", username);

        startActivity(intent);

    }
}
