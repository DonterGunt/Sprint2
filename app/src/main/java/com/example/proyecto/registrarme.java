package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registrarme extends AppCompatActivity {

    private Button btnRegistro;
    private TextView textContra,textCelular,textCorreo,textNombre;
    private EditText editContra,editCelular,editCorreo,editNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarme);

        btnRegistro = (Button) findViewById(R.id.btnRegistro);

        textContra = (TextView) findViewById(R.id.textContra);
        textCelular = (TextView) findViewById(R.id.textCelular);
        textCorreo = (TextView) findViewById(R.id.textCorreo);
        textNombre = (TextView) findViewById(R.id.textNombre);

        editContra = (EditText) findViewById(R.id.editContra);
        editCelular = (EditText) findViewById(R.id.editCelular);
        editCorreo = (EditText) findViewById(R.id.editCorreo);
        editNombre = (EditText) findViewById(R.id.editNombre);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), IniciarSeccion.class);
                startActivity(intent);
            }
        });
    }
}