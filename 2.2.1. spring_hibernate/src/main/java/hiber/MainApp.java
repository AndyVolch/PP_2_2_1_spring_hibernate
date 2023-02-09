package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {

      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      // ПУНКТ 5
//      User user1 = userService.getUserByCar("ГАЗ", 2106);
//      System.out.println(user1);
//      User user2 = userService.getUserByCar("Lada", 777);
//      System.out.println(user2);

      // ПУНКТ 4

//      User andy = new User("Kata", "Man", "CoolJava@mail.com");
//      User artem = new User("Andy", "Voloshin", "1234@mail.com");
//      User lilya = new User("Leo", "Messi", "MessiTheChampion@mail.com");
//      Car car1 = new Car("Aston Martin", 3);
//      Car car2 = new Car("Vitz", 666);
//      Car car3 = new Car("ErorrCar", 404);
//      andy.setCar(car1);
//      artem.setCar(car2);
//      lilya.setCar(car3);
//
//      userService.add(andy);
//      userService.add(artem);
//      userService.add(lilya);

//      List<User> users = userService.listUsers();
//      for(User user:users) {
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println("Car: " + user.getCar());
//      }

      // ПУНКТ 1

//      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
//      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
//      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
//      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));
//
//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }

      context.close();
   }
}