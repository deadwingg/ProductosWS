package com.deadwingg.service;

import com.deadwingg.domain.Producto;

import java.util.List;

public interface ProductoService {
    Producto getProducto(String codigo);
    List<Producto> findProductos();
    void addProducto(String descripcion, float precio, String codigo);
    void addProducto(Producto p);
}
