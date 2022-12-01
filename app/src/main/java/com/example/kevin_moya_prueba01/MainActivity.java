package com.example.kevin_moya_prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarPrograma();
    }

    private void iniciarPrograma() {
        siguiente = findViewById(R.id.button_Siguiente1);

        clickSiguiente();
    }

    private void clickSiguiente() {
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toSecond = new Intent(MainActivity.this, Pagina2.class);
            }
        });
    }
}