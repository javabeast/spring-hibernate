package com.spring.hibernate.springhibernate.daoImpl;

import com.spring.hibernate.springhibernate.dao.UsersDao;
import com.spring.hibernate.springhibernate.domain.City;
import com.spring.hibernate.springhibernate.domain.Users;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class UsersDaoImpl implements UsersDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Users> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Users> query = currentSession.createQuery("from users", Users.class);
        List<Users> list = query.getResultList();
        return list;
    }

    @Override
    public Users get(String userName) {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Users> query = currentSession.createQuery("from Users where username = :userName ", Users.class);
        query.setParameter("userName", userName);
        Users user = query.getSingleResult();
        return user;
    }

    @Override
    public void save(Users users) {

    }

    @Override
    public void delete(int id) {

    }
}
