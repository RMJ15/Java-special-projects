package com.example.User.mapper;

import com.example.User.User;
import com.example.User.entityDB.UserEntityDB;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    UserEntityDB toUserEntityDB(User user);
    List<UserEntityDB> toUsersEntityDBList(List<User> user);
}
