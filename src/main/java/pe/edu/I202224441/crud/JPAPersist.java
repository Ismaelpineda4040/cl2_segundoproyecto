package pe.edu.I202224441.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAPersist {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1 ismael");
    EntityManager em = emf.createEntityManager();




}
