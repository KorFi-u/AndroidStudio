package com.example.newskates;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIngresarProductos, btnListaDeProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        setTheme(R.style.Theme_NewSkates);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresarProductos = findViewById(R.id.btnIngresarProductos);
        btnListaDeProductos = findViewById(R.id.btnListaDeProductos);

        btnIngresarProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VentanaIngresarProductos.class);
                startActivity(intent);
            }
        });

        btnListaDeProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VentanaDeProductos.class);
                startActivity(intent);
            }
   });
    }
}