package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import com.example.QuanLyNhapXuatKho.entity.NhaCungCap;

public interface NhaCungCapService {
    List<NhaCungCap> getAllNhaCungCap();
    NhaCungCap saveNhaCungCap(NhaCungCap nhaCungCap);
    NhaCungCap getNhaCungCap(Long maNhaCungCap);
    NhaCungCap updateNhaCungCap(NhaCungCap nhaCungCap);
    void deleteNhaCungCap(Long maNhaCungCap);
    Boolean ifNhaCungCapExisted(String tenNhaCungCap);
}
