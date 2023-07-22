package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                String name = editText1.getText().toString();
                String lastname = editText2.getText().toString();
                String email = editAddress.getText().toString();
                String pass = editPassword.getText().toString();

                if(name.isEmpty() || lastname.isEmpty() || !email.contains("@") || pass.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Completar campos", Toast.LENGTH_SHORT).show();
                    return;
                }
                String text = "usuario" + name + " " + lastname + "Email: " + email+ "Contraseña: " + pass;
                Toast.makeText(getBaseContext(), text, Toast.LENGTH_LONG).show();

            }
        });



    }
}