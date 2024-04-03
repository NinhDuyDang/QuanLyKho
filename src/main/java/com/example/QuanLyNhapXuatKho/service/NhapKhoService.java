package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import com.example.QuanLyNhapXuatKho.entity.NhapKho;

public interface NhapKhoService {
    List<NhapKho> getAllNhapKho();
    NhapKho saveNhapKho(NhapKho nhapKho);
    NhapKho getNhapKho(Long maNhapKho);
    NhapKho updateNhapKho(NhapKho nhapKho);
    void deleteNhapKho(Long maNhapKho);
    Boolean ifNhapKhoExisted(String tenNhapKho);
}
