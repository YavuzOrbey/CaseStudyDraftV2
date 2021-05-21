package springwork.dao;

import java.util.List;

public interface GenericDAO<E> extends DatabaseDAO{
    E findById(int id);
    public default void saveToDatabase(E entity){
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        System.out.println("Saved to database!");
    }
    default void updateDatabase(E entity){
        entityManager.merge(entity);
    }

    List<E> findAll();
}
