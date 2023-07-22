package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText1;
        EditText editText2;
        EditText editAddress;
        EditText editPassword;

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editAddress = findViewById(R.id.editAddress);
        editPassword = findViewById(R.id.editPassword);

        Button btnCreate = findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =

            }
        });



    }
}