package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import com.example.QuanLyNhapXuatKho.entity.XuatKho;

public interface XuatKhoService {
    List<XuatKho> getAllXuatKho();
    XuatKho saveXuatKho(XuatKho xuatKho);
    XuatKho getXuatKho(Long maXuatKho);
    XuatKho updateXuatKho(XuatKho xuatKho);
    void deleteXuatKho(Long maXuatKho);
    Boolean ifXuatKhoExisted(String tenXuatKho);
}
