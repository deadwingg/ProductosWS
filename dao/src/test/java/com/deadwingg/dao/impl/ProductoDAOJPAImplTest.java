package com.deadwingg.dao.impl;

import com.deadwingg.dao.ProductoDAO;
import com.deadwingg.domain.Producto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProductoDAOJPAImplTest {

    @Test
    public void getProducto() {
        ProductoDAO dao = new ProductoDAOJPAImpl();
        Producto p = dao.getProducto("PEN01");
        assertEquals(1, p.getId());
        assertEquals("pendrive", p.getDescripcion());
        assertEquals("PEN01", p.getCodigo());
    }

    @Test
    public void findProductos() {
        ProductoDAO dao = new ProductoDAOJPAImpl();
        List<Producto> resultado = dao.findProductos();
        assertEquals(4, resultado.size());
    }

    @Test
    public void addProducto() {
        ProductoDAO dao = new ProductoDAOJPAImpl();
        Producto p = new Producto("Placeholder", "PL01", 1);
        dao.addProducto(p);
        assertEquals(5, dao.findProductos().size());
    }
}