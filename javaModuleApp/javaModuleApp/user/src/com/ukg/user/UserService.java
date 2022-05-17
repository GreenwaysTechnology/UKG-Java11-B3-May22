package com.ukg.user;

import com.ukg.admin.AuthService;

public class UserService {
    public String checkLogin() {
        AuthService authService = new AuthService();
        return authService.login();
    }
}
