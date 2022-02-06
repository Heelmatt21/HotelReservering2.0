package Dao;

import Entities.Locatie;
import Entities.Reserveringen;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReserveringenDao {
    private EntityManager entityManager;

    public ReserveringenDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Reserveringen> retrieveReserveringenList() {
        entityManager.getTransaction().begin();
        String jpql = "select c from Reserveringen c";
        TypedQuery<Reserveringen> query = entityManager.createQuery(jpql, Reserveringen.class);
        List<Reserveringen> rederveringenList = query.getResultList();
        entityManager.getTransaction().commit();
        return rederveringenList;
    }

    public Reserveringen findByReserveringId(Integer resrveringId) {
        entityManager.getTransaction().begin();
        String jpql = "select c from Reserveringen c  where c.reservering_id = :reservering_id";
        TypedQuery<Reserveringen> query = entityManager.createQuery(jpql, Reserveringen.class);
        Reserveringen reserveringen = query.setParameter("reservering_id", resrveringId).getSingleResult();
        entityManager.getTransaction().commit();
        return reserveringen;
    }

    public Reserveringen insert(Reserveringen reserveringen) {
        entityManager.getTransaction().begin();
        entityManager.persist(reserveringen);
        entityManager.getTransaction().commit();
        return reserveringen;
    }

    public int updateReserveringen(Reserveringen reserveringen) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("UPDATE Reserveringen c SET c.reserveerDatum = :reserveerDatum where c.reservering_id = :reservering_id");
        query.setParameter("reservering_id", reserveringen.getReservering_id());
        query.setParameter("reserveerDatum", reserveringen.getReserveerDatum());
        int rowsUpdated = query.executeUpdate();
        System.out.println("entities Updated: " + rowsUpdated);
        entityManager.getTransaction().commit();
        return rowsUpdated;
    }

    public int delete(Integer reserveringId) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Reserveringen c where c.reservering_id = :reservering_id");
        query.setParameter("reservering_id", reserveringId);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
}
