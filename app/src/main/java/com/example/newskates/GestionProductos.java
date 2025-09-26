package com.example.newskates;

import java.util.ArrayList;
import java.util.List;

public class GestionProductos {

    private static List<Producto> listaProductos = new ArrayList<>();
    private static int siguienteId = 1;

    public static void agregarProducto(String nombre, double precio, int cantidad) {
        if (nombre != null && !nombre.isEmpty() && precio > 0 && cantidad > 0) {
            Producto producto = new Producto(siguienteId++, nombre, precio, cantidad);
            listaProductos.add(producto);
        }
    }

    public static List<Producto> getListaProductos() {
        return listaProductos;
    }

    public static Producto buscarProductoPorId(int id) {
        for (Producto p : listaProductos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static boolean eliminarProducto(int id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            listaProductos.remove(producto);
            return true;
        }
        return false;
    }
}
