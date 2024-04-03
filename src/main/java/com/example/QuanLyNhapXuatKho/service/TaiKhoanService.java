package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import com.example.QuanLyNhapXuatKho.entity.TaiKhoan;

public interface TaiKhoanService {
    List<TaiKhoan> getAllTaiKhoan();
    TaiKhoan saveTaiKhoan(TaiKhoan taiKhoan);
    TaiKhoan getTaiKhoan(Long maTaiKhoan);
    TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan);
    void deleteTaiKhoan(Long maTaiKhoan);
    Boolean ifTaiKhoanExisted(String tenTaiKhoan);
}
