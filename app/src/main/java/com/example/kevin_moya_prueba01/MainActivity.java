package com.example.kevin_moya_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button siguiente, resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarPrograma();
    }

    private void iniciarPrograma() {
        siguiente = findViewById(R.id.button_Siguiente1);

        clickSiguiente();
        clickResultados();
    }

    private void clickResultados() {
        resultados = findViewById(R.id.button_resultados);

        resultados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dividendo = 0;
                int divisor = 0;
                int entero = 0;
                int residuo = 0;

                for(int i = divisor; i <= dividendo; i+=divisor){

                }

            }
        });
    }

    private void clickSiguiente() {
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSecond = new Intent(MainActivity.this, Pagina2.class);

                startActivity(toSecond);
            }
        });
    }
}