package com.example.exam25.Dao;

import com.example.exam25.Entity.Document;
import com.example.exam25.Entity.Magazine;
import com.example.exam25.Entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class DocumentDao {
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("DB");
    public List<Document> getAllDocuments() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT d FROM Document d", Document.class).getResultList();
        } finally {
            em.close();
        }
    }
    public void AjouterStudent(Magazine magazine)
    {
        EntityManager em=emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(magazine);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }
    public Document getDocumentById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Document.class, id);
        } finally {
            em.close();
        }
    }
}
