package com.example.fencincoachapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrarAsaltoActivity extends AppCompatActivity {
    private TextView textViewNombreRival;
    private TextView textViewTocadosRival;
    private TextView textViewTocados;
    private Button buttonRegistrarAsalto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrar_asalto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textViewNombreRival = findViewById(R.id.textViewNombreRival);
        textViewTocadosRival = findViewById(R.id.textViewTocadosRival);
        textViewTocados = findViewById(R.id.textViewTocados);
        buttonRegistrarAsalto = findViewById(R.id.buttonRegistrarAsalto);
    }

    public void Registrar(View view) {
    }
}