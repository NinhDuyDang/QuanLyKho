package com.example.QuanLyNhapXuatKho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.CustomUserDetails;
import com.example.QuanLyNhapXuatKho.entity.TaiKhoan;
import com.example.QuanLyNhapXuatKho.repository.TaiKhoanRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Override
    public UserDetails loadUserByUsername(String tenTaiKhoan) throws UsernameNotFoundException {
        TaiKhoan taiKhoan = taiKhoanRepository.findByTenTaiKhoan(tenTaiKhoan);
        if(taiKhoan == null){
            throw new UsernameNotFoundException( "TaiKhoan not found");
        }
        return new CustomUserDetails(taiKhoan);
    }
    
}
