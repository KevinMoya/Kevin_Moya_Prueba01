package com.example.kevin_moya_prueba01;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pagina3 extends AppCompatActivity {
    EditText nombre, apellido, dividendo, divisor, numero;
    Button cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina3);

        iniciarTercera();
        clickCerrar();
    }

    private void clickCerrar() {
        cerrar = findViewById(R.id.button_cerrar3);

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dividendo = findViewById(R.id.editText_Dividendo3);
                divisor = findViewById(R.id.editText_Divisor3);
                numero = findViewById(R.id.editText_NumeroInvertido3);


                String divr = divisor.getText().toString();
                String divd = dividendo.getText().toString();
                String num = numero.getText().toString();

                String send = divr + "." + divd + "." + num;

                Intent intent = new Intent();
                intent.setData(Uri.parse(send));
                setResult(Activity.RESULT_OK, intent);

                finish();

            }
        });
    }

    private void iniciarTercera() {
        nombre = findViewById(R.id.editText_Nombres3);
        apellido = findViewById(R.id.editText_Apellidos3);

        Bundle extras = getIntent().getExtras();

        String nombres = extras.getString("nombres");
        String apellidos = extras.getString("apellidos");



        nombre.setText(nombres);
        apellido.setText(apellidos);
    }
}