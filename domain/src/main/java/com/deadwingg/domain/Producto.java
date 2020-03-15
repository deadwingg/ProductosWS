package com.deadwingg.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    int id;
    String descripcion;
    @Column(length = 10, unique = true)
    String codigo;
    float precio;

    public Producto(String descripcion, String codigo, float precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
