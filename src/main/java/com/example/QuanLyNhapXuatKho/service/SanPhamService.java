package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import com.example.QuanLyNhapXuatKho.entity.SanPham;

public interface SanPhamService {
    List<SanPham> getAllSanPham();
    SanPham saveSanPham(SanPham sanPham);
    SanPham getSanPham(Long maSanPham);
    SanPham updateSanPham(SanPham sanPham);
    void deleteSanPham(Long maSanPham);
    Boolean ifSanPhamExisted(String tenSanPham);
}
