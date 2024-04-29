package com.example.fencincoachapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SesionEntrenamientoUsuario extends AppCompatActivity {
    private Button buttonPlaning;
    private Button buttonMarcador;
    private Button buttonRegistroAsalto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sesion_entrenamiento_usuario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Planing() {
        //Se accede a un pdf que contiene los ejercicios de la sesion

    }
    public void AcesoMarcador() {
        //Accede a la ventana del marcador

    }
    public void RegistrarAsalto() {
        //Introduce el asalto en la base de datos

    }
}