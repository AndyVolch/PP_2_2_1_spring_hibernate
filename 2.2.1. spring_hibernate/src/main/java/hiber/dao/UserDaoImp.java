package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }
   @Override
   public User getUserByCar(String model, int series) {
      Session session = sessionFactory.getCurrentSession();
      Query query = session.createQuery("from Car where model=:model " +
              "and series=:series");
      query.setParameter("model", model);
      query.setParameter("series", series);
      List<Car> carList = query.getResultList();
      if (carList.size() > 0) {
         return carList.get(0).getUser();
      } else {
         return null;
      }
   }
}
