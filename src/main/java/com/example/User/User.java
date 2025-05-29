package com.example.User;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


import java.util.ArrayList;




@Data
@RequiredArgsConstructor
public class User {
    private Long id;


    @NonNull
    private String name;

    public static ArrayList<User> usersList = new ArrayList<User>();
}
