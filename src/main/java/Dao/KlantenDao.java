package Dao;

import Entities.Klanten;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class KlantenDao {
    private EntityManager entityManager;

    public KlantenDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Klanten> retrieveKlantenList() {
        entityManager.getTransaction().begin();
        String jpql = "select c from Klanten c";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        List<Klanten> klantenList = query.getResultList();
        entityManager.getTransaction().commit();
        return klantenList;
    }
    //find by familienaam
    public Klanten findByKlantFamilienaam(String familienaam) {
        entityManager.getTransaction().begin();
        String jpql = "select c from Klanten c  where c.familienaam = :familienaam";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        Klanten klanten = query.setParameter("familienaam", familienaam).getSingleResult();
        entityManager.getTransaction().commit();
        return klanten;
    }
    //find by telefoonnummer
    public Klanten findByTelefoonnummer(Integer telefoonnummer) {
        entityManager.getTransaction().begin();
        String jpql1 = "select c from Klanten c where c.telefoonnummer = :telefoonnummer";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql1, Klanten.class);
        Klanten klanten1 = query.setParameter("telefoonnummer", telefoonnummer).getSingleResult();
        entityManager.getTransaction().commit();
        return klanten1;
    }

    //find by klantnummer
    public Klanten findByKlantnummer(String klantnummer){
        entityManager.getTransaction().begin();
        String jpql2 = "select c from Klanten c where c.klantnummer = :klantnummer";
        TypedQuery<Klanten>query = entityManager.createQuery(jpql2, Klanten.class);
        Klanten klanten2 = query.setParameter("klantnummer", klantnummer).getSingleResult();
        entityManager.getTransaction().commit();
        return klanten2;
    }

    public Klanten insert(Klanten klanten) {
        entityManager.getTransaction().begin();
        entityManager.persist(klanten);
        entityManager.getTransaction().commit();
        return klanten;
    }

    public int updateKlanten(Klanten klanten) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Klanten c SET c.adres = :adres where c.familienaam= :familienaam and c.telefoonnummer= :telefoonnummer");
        query.setParameter("familienaam", klanten.getFamilienaam());
        query.setParameter("telefoonnummer", klanten.getTelefoonnummer());
        query.setParameter("adres", klanten.getAdres());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }

    public int delete(String klantnummer) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Klanten c where c.klantnummer = :klantnummer");
        query.setParameter("klantnummer", klantnummer);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }

}
