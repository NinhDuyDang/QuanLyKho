package com.example.QuanLyNhapXuatKho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuanLyNhapXuatKho.entity.XuatKho;

import java.util.List;

@Repository
public interface XuatKhoRepository extends JpaRepository<XuatKho, Long> {
    @Query("SELECT xk FROM XuatKho xk WHERE xk.ngayNhap=?1")
    public XuatKho findByNgayNhap(String ngayNhap);

    @Query("SELECT xk FROM XuatKho xk WHERE xk.ngayNhap>?1 and xk.ngayNhap<?2")
    public List<XuatKho> findByRange(String start, String end);
}
