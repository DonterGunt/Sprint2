package com.example.proyecto.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.icu.text.IDNA;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyecto.Entidades.Producto;
import com.example.proyecto.InfoProductos;
import com.example.proyecto.R;

import java.util.ArrayList;

public class ProductoAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Producto> arrayProductos;

    public ProductoAdapter(Context context, ArrayList<Producto> arrayProductos) {
        this.context = context;
        this.arrayProductos = arrayProductos;
    }

    @Override
    public int getCount() {
        return arrayProductos.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProductos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.servicios_template,null);

        Producto producto = arrayProductos.get(i);

        ImageView imgServ = (ImageView) view.findViewById(R.id.imgServ);
        TextView textNameServ =(TextView) view.findViewById(R.id.textNameServ);

        TextView textPrecServ =(TextView) view.findViewById(R.id.textPrecServ);

        imgServ.setImageResource(producto.getImage());
        textNameServ.setText(producto.getName());

        textPrecServ.setText(String.valueOf(producto.getPrice()));

        imgServ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), InfoProductos.class);
                intent.putExtra("name", producto.getName());
                intent.putExtra("description", producto.getDescription());
                intent.putExtra("price",String.valueOf (producto.getPrice()));
                intent.putExtra("image", producto.getImage());
                context.startActivity(intent);

            }
        });
        return view;
    }
}
