package com.example.newskates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

public class VentanaDeProductos extends AppCompatActivity {

    private GestionProductos gestionProductos;
    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_de_productos);

        tableLayout = findViewById(R.id.tableLayoutProductos);

        gestionProductos = new GestionProductos();


        mostrarProductosEnTabla();
    }

    private void mostrarProductosEnTabla() {
        List<Producto> lista = gestionProductos.getListaProductos();

        for (Producto p : lista) {
            TableRow fila = new TableRow(this);

            TextView txtId = new TextView(this);
            txtId.setText(String.valueOf(p.getId()));
            txtId.setPadding(8, 8, 8, 8);

            TextView txtNombre = new TextView(this);
            txtNombre.setText(p.getNombre());
            txtNombre.setPadding(8, 8, 8, 8);

            TextView txtPrecio = new TextView(this);
            txtPrecio.setText(String.valueOf(p.getPrecio()));
            txtPrecio.setPadding(8, 8, 8, 8);

            TextView txtStock = new TextView(this);
            txtStock.setText(String.valueOf(p.getStock()));
            txtStock.setPadding(8, 8, 8, 8);

            fila.addView(txtId);
            fila.addView(txtNombre);
            fila.addView(txtPrecio);
            fila.addView(txtStock);

            tableLayout.addView(fila);
        }
    }
}