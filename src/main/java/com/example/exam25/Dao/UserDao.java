package com.example.exam25.Dao;

import com.example.exam25.Entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserDao {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("DB");
    public void AjouterStudent(User user)
    {
        EntityManager em=emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
}
