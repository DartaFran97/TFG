package com.example.fencincoachapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MarcadorActivity extends AppCompatActivity {
    private EditText editTextNumberTiradorVerde;
    private EditText editTextNumberTiradorRojo;
    private EditText editTextTimeCronometro;
    private Button buttonTocadoVerde;
    private Button buttonTocadoRojo;
    private Button buttonmenosTocadoVerde;
    private Button butttonmenosTocadoRojo;
    private Button buttonResetTiempo;
    private Button buttonResetMarcador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_marcador);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextNumberTiradorVerde = findViewById(R.id.editTextNumberTiradorVerde);
        editTextNumberTiradorRojo = findViewById(R.id.editTextNumberTiradorRojo);
        editTextTimeCronometro = findViewById(R.id.editTextTimeCronometro);
        buttonTocadoVerde = findViewById(R.id.buttonTocadoVerde);
        buttonTocadoRojo = findViewById(R.id.buttonTocadoRojo);
        buttonmenosTocadoVerde = findViewById(R.id.buttonmenosTocadoVerde);
        butttonmenosTocadoRojo = findViewById(R.id.butttonmenosTocadoRojo);
        buttonResetTiempo = findViewById(R.id.buttonResetTiempo);
        buttonResetMarcador = findViewById(R.id.buttonResetMarcador);
    }

    public void resetearTiempo(View view) {
    }

    public void resetearMarcador(View view) {
    }

    public void menosrojo(View view) {
    }

    public void menosverde(View view) {
    }

    public void tocadorojo(View view) {
    }

    public void tocadoverde(View view) {
    }

    public void empezarTiempo(View view) {
    }
}