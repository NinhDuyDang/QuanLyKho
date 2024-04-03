package com.example.QuanLyNhapXuatKho.service;

import com.example.QuanLyNhapXuatKho.entity.DatHang;
import com.example.QuanLyNhapXuatKho.entity.NhaCungCap;

import java.util.List;

public interface DatHangService {
    List<DatHang> getAllDatHang();
    DatHang saveDatHang(DatHang nhaCungCap);
    DatHang getDatHang(Long maDatHang);
    DatHang updateDatHang(DatHang nhaCungCap);
    void deleteDatHang(Long maDatHang);
}
