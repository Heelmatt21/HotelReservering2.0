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

    public Klanten findByKlandId(Integer klantId) {
        entityManager.getTransaction().begin();
        String jpql = "select c from Klanten c  where c.klant_id = :klant_id";
        TypedQuery<Klanten> query = entityManager.createQuery(jpql, Klanten.class);
        Klanten klanten = query.setParameter("klant_id", klantId).getSingleResult();
        entityManager.getTransaction().commit();
        return klanten;
    }

    public Klanten insert(Klanten klanten) {
        entityManager.getTransaction().begin();
        entityManager.persist(klanten);
        entityManager.getTransaction().commit();
        return klanten;
    }

    public int updateKlanten(Klanten klanten) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Klanten c SET c.adres = :adres where c.klant_id= :klant_id");
        query.setParameter("klant_id", klanten.getKlant_id());
        query.setParameter("adres", klanten.getAdres());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }

    public int delete(Integer klantId) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Klanten c where c.klant_id = :klant_id");
        query.setParameter("klant_id", klantId);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }

}
