package com.deadwingg.soap;

import com.deadwingg.domain.Producto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ProductoSoap {
    @WebMethod
    Producto getProducto(@WebParam(name = "codigo") String codigo);
    @WebMethod
    List<Producto> findProductos();
    @WebMethod
    void addProducto(@WebParam(name = "descripcion") String descripcion, @WebParam(name = "precio") float precio, @WebParam(name = "codigo") String codigo);
}
