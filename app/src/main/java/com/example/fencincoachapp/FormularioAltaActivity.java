package com.example.fencincoachapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormularioAltaActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Spinner spinnerCategoria;
    private EditText editTextCorreo;
    private EditText editTextArma;
    private EditText editTextManodominate;
    private Button buttonRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_formulario_alta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        spinnerCategoria = findViewById(R.id.spinnerCategoria);
        editTextCorreo = findViewById(R.id.editTextCorreo);
        editTextArma = findViewById(R.id.editTextArma);
        editTextManodominate = findViewById(R.id.editTextManodominate);
        buttonRegistro = findViewById(R.id.buttonLogin);
    }

    public void Registro(View view) {
    }
}