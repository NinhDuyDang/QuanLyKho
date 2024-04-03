package com.example.QuanLyNhapXuatKho.security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;

@Configuration
@EnableWebSecurity
public class RoleSecurityConfig {
    @Autowired
    UserDetailsService userDetailsService;
    
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Autowired
    private CustomAuthenticationSuccess authenticationSuccessHandler;
    @Autowired
    private CustomAuthenticationFailure authenticationFailureHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().requestMatchers("/", "/index.html", "/login", "/lop", "/dau", "/ac-quy", "/phu-tung", "/register", "/css/**", "/image/**", "/public/**").permitAll();
        http.authorizeRequests()
            .requestMatchers("/admin/**").hasAuthority("ADMIN")
            .requestMatchers("/ke-toan/**").hasAuthority("KETOAN")
            .requestMatchers("/khach-hang/**").hasAuthority("KHACHHANG")
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login")
            .usernameParameter("tenTaiKhoan")
            .passwordParameter("matKhau")
            .successHandler(authenticationSuccessHandler) // Set the custom authentication success handler
            .failureHandler(authenticationFailureHandler) // Set the custom authentication failure handler
            .permitAll()
            .and()
        .logout()
            .permitAll()
            .and()
        .sessionManagement()
            .maximumSessions(1)
            .sessionRegistry(sessionRegistry())
            .expiredUrl("/login?expired") // Redirect to login page if session expires
            .and()
            .and()
            .csrf().disable();

        return http.build();
    }

    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

    @Bean
    public HttpSessionSecurityContextRepository httpSessionSecurityContextRepository() {
        return new HttpSessionSecurityContextRepository();
    }

    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return new ProviderManager(Collections.singletonList(authProvider()));
    }
}
