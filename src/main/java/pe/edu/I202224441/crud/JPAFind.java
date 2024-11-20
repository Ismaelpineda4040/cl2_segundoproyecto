package pe.edu.I202224441.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.I202224441.entity.Country;

public class JPAFind {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cl1 ismael");
        EntityManager em = emf.createEntityManager();

        Country country = em.find(Country.class, "PER");

        System.out.println(country);



    }
}
