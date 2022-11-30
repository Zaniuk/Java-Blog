package com.example.demo.dao;

import com.example.demo.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Repository
@Transactional
public class UserDaoImp implements UsersDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        try {
            String query = "SELECT u FROM User u";
            TypedQuery<User> typedQuery = entityManager.createQuery(query, User.class);
            return typedQuery.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User getUserById(String id) {
        String query = "SELECT u FROM User u WHERE u.id = :id";
        TypedQuery<User> typedQuery = entityManager.createQuery(query, User.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();
    }

    @Override
    public void addUser(User user) {
        try {
            entityManager.persist(user);
        } catch (Exception e) { e.printStackTrace(); }


    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String id) {

    }
}
