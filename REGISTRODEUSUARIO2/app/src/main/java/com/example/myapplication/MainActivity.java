package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        //Raiz de gerarquia de vistas
        setContentView(binding.getRoot());

        //boton crear
        binding.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.editText1.getText().toString();
                String lastname = binding.editText2.getText().toString();
                String email = binding.editAddress.getText().toString();
                String pass = binding.editPassword.getText().toString();

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