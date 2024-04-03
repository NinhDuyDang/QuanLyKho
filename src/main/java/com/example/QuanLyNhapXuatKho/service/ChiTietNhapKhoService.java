package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import com.example.QuanLyNhapXuatKho.entity.ChiTietNhapKho;

public interface ChiTietNhapKhoService {
    List<ChiTietNhapKho> getAllChiTietNhapKho();
    ChiTietNhapKho saveChiTietNhapKho(ChiTietNhapKho chiTietNhapKho);
    ChiTietNhapKho getChiTietNhapKho(Long maChiTietNhapKho);
    ChiTietNhapKho updateChiTietNhapKho(ChiTietNhapKho chiTietNhapKho);
    void deleteChiTietNhapKho(Long maChiTietNhapKho);
    Boolean ifChiTietNhapKhoExisted(String tenChiTietNhapKho);
}
