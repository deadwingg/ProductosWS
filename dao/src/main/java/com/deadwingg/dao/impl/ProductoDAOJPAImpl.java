package com.deadwingg.dao.impl;

import com.deadwingg.dao.ProductoDAO;
import com.deadwingg.domain.Producto;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

public class ProductoDAOJPAImpl implements ProductoDAO {
    private EntityManagerFactory factory;

    public ProductoDAOJPAImpl(){
        factory = Persistence.createEntityManagerFactory("productosDB");
    }

    @Override
    public Producto getProducto(String codigo) {
        Producto p = null;
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            String sql = "SELECT e FROM Producto e WHERE e.codigo = :codigo"; // WHERE e.codigo = :codigo
            TypedQuery<Producto> query = em.createQuery(sql, Producto.class).setParameter("codigo", codigo); // .setParameter("codigo", codigo)
            Optional<Producto> resultado = Optional.of(query.getSingleResult());
            if (resultado.isPresent()){
                p = resultado.get();
            }
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return p;
    }

    @Override
    public List<Producto> findProductos() {
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        List<Producto> resultados = null;
        try {
            transaction.begin();
            String sql = "SELECT e FROM Producto e";
            TypedQuery<Producto> query = em.createQuery(sql, Producto.class);
            resultados = query.getResultList();
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return resultados;
    }

    @Override
    public void addProducto(Producto p) {
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(p);
            transaction.commit();
        } catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
}
