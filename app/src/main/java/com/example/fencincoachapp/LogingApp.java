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

public class LogingApp extends AppCompatActivity {
    EditText textUsuario;
    EditText textPassword;
    Button Login;
    Button olvideContrasena;
    Button CrearUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginapp);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textUsuario=findViewById(R.id.editTextSesionCode);
        textPassword=findViewById(R.id.editTextPassword);
    }

    public void login(View view) {


    }

    public void contrasenaOlvidada(View view) {
    }

    public void crearUsuario(View view) {
    }


}