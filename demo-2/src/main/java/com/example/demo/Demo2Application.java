package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo2Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
//		user.setName("Nishant");
//		user.setCity("UP");
//		user.setStatus("Complicated");
//		
//		User user1 = new User();
//		user1.setName("Abhishek");
//		user1.setCity("Bihar");
//		user1.setStatus("Taken");
//		
//		User user2 = new User();
//		user2.setName("Akshay");
//		user2.setCity("Kolhapur");
//		user2.setStatus("Not sure");
		
		//To save single user
	//	User save = userRepository.save(user);
	//	System.out.println(save);
		
		//save multiple objects
//		List<User> entities = List.of(user,user1,user2);
//		userRepository.saveAll(entities);
		
		//update
		
//		Optional<User> data = userRepository.findById(52);
//		User user2 = data.get();
//		user2.setName("Nichant Chaddha");
//		User result = userRepository.save(user2);
//		System.out.println(result);
		
		
		//get data
		
		Iterable<User> itr = userRepository.findAll();
		Iterator<User> i = itr.iterator();
//		while(i.hasNext()) {
//			User user1 = i.next();
//			System.out.println(user1);
//		}
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
//		itr.forEach(abc->System.out.println(abc));
		
		//userRepository.deleteById(2);
		//List<User> user1 = userRepository.findByName("Saurabh");
		
		//List<User> user1 = userRepository.findByNameAndCity("akshay", "Kolhapur");
		//user1.forEach(e -> System.out.println(e));
		
//		List<User> user1 = userRepository.findByNameStartingWith("ak");
//		user1.forEach(e -> System.out.println(e));
		
		List<User> allUsers = userRepository.getAllUsers();
		//allUsers.forEach(e -> System.out.println(e));
		
		List<User> name = userRepository.getUserByName("akshay");
		//name.forEach(e -> System.out.println(e));
		
		List<User> users = userRepository.getUsers();
		users.forEach(e -> System.out.println(e));
	}

}
