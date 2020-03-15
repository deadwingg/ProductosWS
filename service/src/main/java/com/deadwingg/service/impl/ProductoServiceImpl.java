package com.deadwingg.service.impl;

import com.deadwingg.dao.ProductoDAO;
import com.deadwingg.dao.impl.ProductoDAOJPAImpl;
import com.deadwingg.domain.Producto;
import com.deadwingg.service.ProductoService;

import java.util.List;

public class ProductoServiceImpl implements ProductoService {
    private ProductoDAO dao = new ProductoDAOJPAImpl();
    @Override
    public Producto getProducto(String codigo) {
        return dao.getProducto(codigo);
    }

    @Override
    public List<Producto> findProductos() {
        return dao.findProductos();
    }

    @Override
    public void addProducto(String descripcion, float precio, String codigo) {
        Producto p = new Producto(descripcion, codigo, precio);
        dao.addProducto(p);
    }
}
