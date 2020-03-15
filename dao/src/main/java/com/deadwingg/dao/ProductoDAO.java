package com.deadwingg.dao;

import com.deadwingg.domain.Producto;

import java.util.List;

public interface ProductoDAO {
    Producto getProducto(String codigo);
    List<Producto> findProductos();
    void addProducto(Producto p);
}
