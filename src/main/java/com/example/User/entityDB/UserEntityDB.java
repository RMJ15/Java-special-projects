package com.example.User.entityDB;

import com.example.User.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Entity
@Table(name = "users")
@Data
@RequiredArgsConstructor
public class UserEntityDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    public static ArrayList<UserEntityDB> users = new ArrayList<UserEntityDB>();
}
