package com.ukg.guest;

import com.ukg.admin.AuthService;

public class GuestService {
    public String checkLogin() {
        AuthService authService = new AuthService();
        return authService.login();
    }
}
