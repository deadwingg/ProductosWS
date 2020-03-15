package com.deadwingg.service;

import com.deadwingg.domain.Producto;
import com.deadwingg.service.impl.ProductoServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductoServiceTest {

    @Test
    public void getProducto() {
        ProductoService service = new ProductoServiceImpl();
        Producto p = service.getProducto("PEN01");
        assertEquals(1, p.getId());
        assertEquals("pendrive", p.getDescripcion());
        assertEquals("PEN01", p.getCodigo());
    }

    @Test
    public void findProductos() {
    }

    @Test
    public void addProducto() {
        ProductoService service = new ProductoServiceImpl();
        service.addProducto("PLACEHOLDER", 1, "PL01");
        assertEquals(5, service.findProductos().size());
    }
}