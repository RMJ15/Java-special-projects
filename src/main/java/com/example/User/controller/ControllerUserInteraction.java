package com.example.User.controller;

import java.util.ArrayList;

import com.example.User.User;

public class ControllerUserInteraction {


    public void addUser(User name) {
        User.usersList.add(name);
    }

    public String equalsUserID(long id){
        String result = "";
        for(User user: User.usersList) {
            if(id == user.getId()) {
                result = user.getName();

            } else {
                result = "Пользователь с таким ID не существует";

            }
        }

        return result;
    }

    public ArrayList<User> listUsers() {
        return User.usersList;
    }

    public void deleteListUsers() {
        User.usersList.removeAll(User.usersList);
        System.out.println("Список пользователей успешно удален");
    }
}
