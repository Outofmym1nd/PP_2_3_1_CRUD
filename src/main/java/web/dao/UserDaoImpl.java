package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;

    private UserDaoImpl() {
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void removeUserById(long id) {
//        if (isUserExists(id)) {
            entityManager.remove(getUser(id));
//        }
    }

    @Override
    public User getUser(long id) {      // Long or long - What's the difference in this case?
        return entityManager.find(User.class, id);
    }

    @Override
    public void editUser(User updatedUser, Long id) {
        entityManager.merge(updatedUser);
    }

//    private boolean isUserExists(long id) {
//        Query query = entityManager.createQuery("SELECT u.id FROM User u WHERE u.id = :id");
//        query.setParameter("id", id);
//        return query.getSingleResult() != null;
//    }
}
