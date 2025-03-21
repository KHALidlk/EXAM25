package com.example.exam25.Dao;

import com.example.exam25.Entity.Borrow;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class BorrowDao {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("DB");
    public List<Borrow> getAllBorrow() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT d FROM Borrow d", Borrow.class).getResultList();
        } finally {
            em.close();
        }
    }
        public void saveBorrow(Borrow borrrow) {
            EntityManager em = emf.createEntityManager();
            try {
                em.getTransaction().begin();
                em.persist(borrrow);
                em.getTransaction().commit();
            } finally {
                em.close();
            }
        }
    }

