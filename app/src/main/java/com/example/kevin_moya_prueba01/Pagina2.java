package com.example.kevin_moya_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Pagina2 extends AppCompatActivity {
    EditText nombre, apellido;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        iniciarPagina();
    }

    private void iniciarPagina() {
        nombre = findViewById(R.id.editText_Nombres2);
        apellido = findViewById(R.id.editText_Apellidos2);
        siguiente = findViewById(R.id.button_Siguiente2);

        clickSiguiente();
    }

    private void clickSiguiente() {

    }
}