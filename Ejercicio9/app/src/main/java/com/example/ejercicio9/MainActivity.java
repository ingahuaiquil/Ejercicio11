package com.example.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    int imagen1 = R.drawable.ic_launcher_background;
    int imagen2 = R.drawable.ic_launcher_foreground;
    int imagen3 = R.drawable.ic_launcher_background;
    int imagen4 = R.drawable.ic_launcher_foreground;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners(){
        ImageButton boton1= findViewById(R.id.button1);
        ImageButton boton2= findViewById(R.id.button2);
        ImageButton boton3= findViewById(R.id.button3);
        ImageButton boton4= findViewById(R.id.button4);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //añadir el add int
                moveToSecondActivity(imagen1);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen2);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen3);
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity(imagen4);
            }
        });

    }
    public void moveToSecondActivity(int imagen1){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Clave", imagen1);
        startActivity(intent);
    }


}