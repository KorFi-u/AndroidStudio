package com.example.newskates;
import java.util.ArrayList;
public class Venta {
    private int id;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private double total;

    public Venta(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        total += p.getPrecio();
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public ArrayList<Producto> getProductos() { return productos; }
    public double getTotal() { return total;}
}