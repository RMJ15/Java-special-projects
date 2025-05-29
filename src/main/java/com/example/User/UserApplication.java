package com.example.User;


import com.example.User.entityDB.UserEntityDB;
import com.example.User.mapper.UserMapper;
import com.example.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class UserApplication {
	@Autowired
	private UserRepository userRepository;


	private UserMapper userMapper;


	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);


	}



	CommandLineRunner run(UserRepository userRepository) {
		return args -> {
			User user = new User("sdsf");



			UserEntityDB userEntityDB = userMapper.toUserEntityDB(user);
			userRepository.save(userEntityDB);
		};


	}


}
