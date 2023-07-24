package com.example.calculadora;

import static com.example.calculadora.R.id.change_theme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // IDENTIFICAR LOS VALORES
        EditText numero1 = findViewById(R.id.numero1);
        EditText numero2 = findViewById(R.id.numero2);


        // IDENTIFICAR LA OPERACIÓN A REALIZAR
        // Importar
        Button sumar = findViewById(R.id.Sumar);
        Button restar = findViewById(R.id.Restar);
        Button multiplicar = findViewById(R.id.Multi);
        Button dividir = findViewById(R.id.Divi);



        // Realizar la operación
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // QUE LOS CAMPOS NO ESTEN VACIOS
                // trim: ELIMINA LOS ESPACIOS
                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(), "Favor ingresar número", Toast.LENGTH_SHORT).show();
                    return;
                }
                // CAMBIA DE FORMATO LO INGRESADO
                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());
                // REALIZA LA OPERACIÓN
                Integer suma = primer + segundo;
                // ENTREGA EL RESULTADO CON UN TOAST - MENSAJE
                Toast.makeText(getBaseContext(), "Resultado: " + suma.toString(),Toast.LENGTH_LONG).show();

             }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(), "Favor ingresar número", Toast.LENGTH_SHORT).show();
                    return;
                }
                // CAMBIA DE FORMATO LO INGRESADO
                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());
                // REALIZA LA OPERACIÓN
                Integer restar = primer - segundo;
                // ENTREGA EL RESULTADO CON UN TOAST - MENSAJE
                Toast.makeText(getBaseContext(), "Resultado: " + restar.toString(),Toast.LENGTH_LONG).show();

            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(), "Favor ingresar número", Toast.LENGTH_SHORT).show();
                    return;
                }
                // CAMBIA DE FORMATO LO INGRESADO
                Integer primer = Integer.parseInt(numero1.getText().toString());
                Integer segundo = Integer.parseInt(numero2.getText().toString());
                // REALIZA LA OPERACIÓN
                Integer multi = primer * segundo;
                // ENTREGA EL RESULTADO CON UN TOAST - MENSAJE
                Toast.makeText(getBaseContext(), "Resultado: " + multi.toString(),Toast.LENGTH_LONG).show();

            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(), "Favor ingresar número", Toast.LENGTH_SHORT).show();
                    return;
                }
                // CAMBIA DE FORMATO LO INGRESADO
                Integer primer = Integer.parseInt(numero1.getText().toString());
                // NO DIVIDA POR 0

               if (Integer.parseInt(numero2.getText().toString()) == 0 ){
                   Toast.makeText(getBaseContext(), "No se posible dividir por 0: ", Toast.LENGTH_SHORT).show();
               }
                                   Integer segundo = Integer.parseInt(numero2.getText().toString());
                // REALIZA LA OPERACIÓN
                Integer divi = primer / segundo;
                // ENTREGA EL RESULTADO CON UN TOAST - MENSAJE
                Toast.makeText(getBaseContext(), "Resultado: " + divi.toString(),Toast.LENGTH_LONG).show();


            }
        });
    }




}