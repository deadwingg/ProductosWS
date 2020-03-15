package com.deadwingg.soap.impl;


import com.deadwingg.domain.Producto;
import com.deadwingg.service.impl.ProductoServiceImpl;
import com.deadwingg.soap.ProductoSoap;

import javax.jws.WebService;
import java.util.List;
@WebService(endpointInterface = "com.deadwingg.soap.ProductoSoap")
public class ProductoSoapImpl implements ProductoSoap {

    private final ProductoServiceImpl productoService = new ProductoServiceImpl();

    @Override
    public Producto getProducto(String codigo) {
        return productoService.getProducto(codigo);
    }

    @Override
    public List<Producto> findProductos() {
        return productoService.findProductos();
    }

    @Override
    public void addProducto(String descripcion, float precio, String codigo) {
        productoService.addProducto(descripcion, precio, codigo);
    }
}
