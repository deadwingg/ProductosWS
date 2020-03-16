package com.deadwingg.rest;

import com.deadwingg.domain.Producto;
import com.deadwingg.service.impl.ProductoServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/productos")
public class ProductoRestImpl {
    private final ProductoServiceImpl productoService = new ProductoServiceImpl();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{codigo}")
    public Producto getProducto(@PathParam("codigo") String codigo){
        return productoService.getProducto(codigo);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> findProductos(){
        return productoService.findProductos();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addProducto(Producto p){
        System.out.println(p);
        productoService.addProducto(p);
        return Response.ok().build();
    }
}
