package com.ukg.user;

public class UserMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.checkLogin());
    }
}
