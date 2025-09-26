package com.example.newskates;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VentanaIngresarProductos extends AppCompatActivity {

    private EditText ptNombre, ptCantidad, ptPrecio;
    private Button btnAgregarProducto;

    private GestionProductos gestionProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_ingresar_productos);

        gestionProductos = new GestionProductos();

        ptNombre = findViewById(R.id.ptNombre);
        ptCantidad = findViewById(R.id.ptCantidad);
        ptPrecio = findViewById(R.id.ptPrecio);
        btnAgregarProducto = findViewById(R.id.btnAgregarProducto);

        btnAgregarProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarProducto();
            }
        });
    }

    private void agregarProducto() {
        try {
            String nombre = ptNombre.getText().toString();
            int cantidad = Integer.parseInt(ptCantidad.getText().toString());
            double precio = Double.parseDouble(ptPrecio.getText().toString());

            gestionProductos.agregarProducto(nombre, precio, cantidad);

            Toast.makeText(this, "Producto agregado: " + nombre, Toast.LENGTH_SHORT).show();

            ptNombre.setText("");
            ptCantidad.setText("");
            ptPrecio.setText("");

        } catch (Exception e) {
            Toast.makeText(this, "Error: revisa los datos ingresados", Toast.LENGTH_SHORT).show();
        }
    }
}
