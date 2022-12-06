package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.proyecto.Adaptadores.ProductoAdapter;
import com.example.proyecto.Entidades.Producto;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private Button btnSalir;
    private ListView listServicios;
    private ProductoAdapter productoAdapter;
    private ArrayList <Producto> arrayProductos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnSalir = (Button) findViewById(R.id.btnSalir);

        listServicios = (ListView) findViewById(R.id.listServicios);
        arrayProductos = new ArrayList<>();

        Producto producto1 = new Producto("Alistamiento Básico", "Este servicio de mecánica de bicicletas es ideal para hacer un diagnóstico del estado de tu bici, nos permite identificar qué repuestos se deben cambiar por daño o por uso. Aplica para bicis de Mountain Bike, Gravel y Ruta.", 80000, R.drawable.mb);
        Producto producto2 = new Producto("Mantenimiento Estándar" , "Necesitas este mantenimiento para tener en óptimas condiciones tu máquina, ya que todo vehículo requiere de un mantenimiento para alargar su vida útil, es el servicio más popular entre nuestros clientes.", 110000, R.drawable.mm);
        Producto producto3 = new Producto("Mantenimiento Pro", "Este es nuestro servicio más completo, especialmente si tienes en cuenta que la vida útil de algunos repuestos (suspensión, frenos hidráulicos, líquido tubeless, pastillas) requieren un mantenimiento específico y así optimizar tu bici al 100%.", 260000, R.drawable.mp);


        arrayProductos.add(producto1);
        arrayProductos.add(producto2);
        arrayProductos.add(producto3);


        productoAdapter = new ProductoAdapter(this,arrayProductos);
        listServicios.setAdapter(productoAdapter);

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}