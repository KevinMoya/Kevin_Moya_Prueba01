package com.example.kevin_moya_prueba01;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button siguiente, resultados;

    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                    if (result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                    }
                }
            });

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

                activityResult.launch(toSecond);
            }
        });
    }
}