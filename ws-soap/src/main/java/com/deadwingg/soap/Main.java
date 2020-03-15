package com.deadwingg.soap;

import com.deadwingg.soap.impl.ProductoSoapImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        System.out.println("publicanod ws soap en el puerto 8000");

        Endpoint.publish("http://localhost:8000/", new ProductoSoapImpl());

        System.out.println("Se ha iniciado el ws PersonaService: en http://localhost:8000/");
        System.out.println("La direccion del wsdl ws http://localhost:8000/?wsdl");
    }
}
