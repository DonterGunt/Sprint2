package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IniciarSeccion extends AppCompatActivity {

    private Button btnIngresar, btnVolver;
    private TextView textUsuario, textContrasena;
    private EditText editUsuario, editContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciarseccion);

        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnVolver = (Button) findViewById(R.id.btnVolver);

        textUsuario = (TextView) findViewById(R.id.textUsuario);
        textContrasena = (TextView) findViewById(R.id.textContrasena);

        editUsuario = (EditText) findViewById(R.id.editUsuario);
        editContrasena = (EditText) findViewById(R.id.editContrasena);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Usuario = editUsuario.getText().toString();
                String Contrasena = editContrasena.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);

            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}