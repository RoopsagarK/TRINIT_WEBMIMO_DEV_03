package com.example.gregor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button = findViewById(R.id.button);
        userName = findViewById(R.id.userName);
        password = findViewById(R.id.password);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = userName.getText().toString();
                String Password = password.getText().toString();
                Intent intent = new Intent(MainActivity.this,FarmerPage.class);
                Intent intent1 = new Intent(MainActivity.this,FarmerInfo.class);
                intent1.putExtra("user_name",UserName);
                startActivity(intent);
            }
        });
    }


    };
