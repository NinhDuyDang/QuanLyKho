package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import com.example.QuanLyNhapXuatKho.entity.ChiTietXuatKho;

public interface ChiTietXuatKhoService {
    List<ChiTietXuatKho> getAllChiTietXuatKho();
    ChiTietXuatKho saveChiTietXuatKho(ChiTietXuatKho chiTietXuatKho);
    ChiTietXuatKho getChiTietXuatKho(Long maChiTietXuatKho);
    ChiTietXuatKho updateChiTietXuatKho(ChiTietXuatKho chiTietXuatKho);
    void deleteChiTietXuatKho(Long maChiTietXuatKho);
    Boolean ifChiTietXuatKhoExisted(String tenChiTietXuatKho);
}
