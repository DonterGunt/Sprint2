package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoProductos extends AppCompatActivity {

    private TextView textMainInfo,textDesInfo,textPresInfo;
    private ImageView imageInfo;
    private Button btnInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_productos);


        textMainInfo = (TextView) findViewById(R.id.textMainInfo);
        textDesInfo = (TextView) findViewById(R.id.textDesInfo);
        textPresInfo = (TextView) findViewById(R.id.textPresInfo);

        imageInfo = (ImageView) findViewById(R.id.imageInfo);
        btnInfo = (Button) findViewById(R.id.btnInfo);

        Intent intentIN = getIntent();
        textMainInfo.setText(intentIN.getStringExtra("name"));
        textDesInfo.setText(intentIN.getStringExtra("description"));
        textPresInfo.setText(intentIN.getStringExtra("price"));
        imageInfo.setImageResource(intentIN.getIntExtra("image",0));

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Home.class);
                startActivity(intent);


            }
        });

    }
}