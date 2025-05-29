package com.example.User;

import com.example.User.entityDB.UserEntityDB;
import com.example.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanComponent {

    private UserRepository userRepository;

    @Bean
    public CommandLineRunner save(UserEntityDB userEntityDB) {
        return args -> {
            UserEntityDB userEntityDB1 = userRepository.save(userEntityDB);
            System.out.println("OK");
        };
    }
}
