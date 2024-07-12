package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
        EntityManager em= factory.createEntityManager();
        em.getTransaction().begin();
        Employee e1=new Employee();
        e1.setId(111L);
        e1.setName("ABC");
        em.persist(e1);//insert the record
        em.getTransaction().commit();
        }
    }
