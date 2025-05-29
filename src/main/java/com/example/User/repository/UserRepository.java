package com.example.User.repository;

import com.example.User.entityDB.UserEntityDB;
import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;


public interface UserRepository extends JpaRepository<UserEntityDB, Long> {
    UserEntityDB save(UserEntityDB user);
    List<UserEntityDB> findAll();

}
