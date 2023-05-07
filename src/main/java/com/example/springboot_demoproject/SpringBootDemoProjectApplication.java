package com.example.springboot_demoproject;

import com.example.springboot_demoproject.dao.UserRepository;
import com.example.springboot_demoproject.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.text.html.Option;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringBootDemoProjectApplication {

    public static void main(String[] args) {

        ApplicationContext ac=SpringApplication.run(SpringBootDemoProjectApplication.class, args);
        UserRepository userRepository=ac.getBean(UserRepository.class);

//        User user= new User();
//        user.setUname("advay");
//        user.setUcity("hyderabad");
//
//        User user1= new User();
//        user1.setUname("rk");
//        user1.setUcity("pune");
//
//        List<User> userlist=List.of(user,user1);
//        userRepository.saveAll(userlist);
//        System.out.println(user);
//        System.out.println(user1);
//        System.out.println("Done");


//        Optional<User> student=userRepository.findById(7);
//        User user=student.get();
//        user.setUcity("manipur");
//        userRepository.save(user);
////        System.out.println(user);


//       Iterable<User> itr= userRepository.findAll();
//       Iterator<User> iterator= itr.iterator();
//
//        while(iterator.hasNext()){
//            User user1=iterator.next();
//            System.out.println(user1);
//        }

        //userRepository.deleteById(3);
User user= new User();
//        List<User> users=userRepository.findByUname("sujan");
//        users.forEach(e-> System.out.println(e));
//
//        List<User> users1=userRepository.findByUcity("pune");
//        users1.forEach(e-> System.out.println(e));

//        List<User> users1=userRepository.findByUcityOrderByUname("pune");
//        users1.forEach(e-> System.out.println(e));

//        List<User> users1=userRepository.getAllUser();
//        users1.forEach(e-> System.out.println(e));

//        List<User> users1=userRepository.getUserbyCity("sujan","nanded");
//        users1.forEach(e-> System.out.println(e));

//                List<User> users1=userRepository.getAll();
//        users1.forEach(e-> System.out.println(e));

        userRepository.getAll().forEach(e-> System.out.println(e));










    }

}
