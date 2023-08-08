package com.learn.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.learn.app.model.Product;

@Repository
public class ProductRepository {
	
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Product addProduct(Product product) {
        entityManager.persist(product);
        return product;
    }

    public Product getProductById(Long id) {
        return entityManager.find(Product.class, id);
    }

    public List<Product> getAllProducts() {
        return entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

}
