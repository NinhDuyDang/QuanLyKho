package com.example.QuanLyNhapXuatKho.security;

import java.io.IOException;
import java.util.Set;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomAuthenticationSuccess implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());

        if (roles.contains("ADMIN")) {
            response.sendRedirect("/admin/trang-chu");
        } else if (roles.contains("KETOAN")) {
            response.sendRedirect("/ke-toan/trang-chu");
        } else if (roles.contains("KHACHHANG")) {
            response.sendRedirect("/khach-hang/trang-chu");
        } else {
            // Handle other roles or scenarios
            response.sendRedirect("/login"); // Redirect to the default page
        }
    }

}
