package com.example.QuanLyNhapXuatKho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuanLyNhapXuatKho.entity.SanPham;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Long> {
    @Query("SELECT sp FROM SanPham sp WHERE sp.tenSanPham=?1")
    public List<SanPham> findByTenSanPham(String tenSanPham);

    @Query("SELECT sp FROM SanPham sp WHERE sp.hangSanPham=?1")
    public List<SanPham> findByHangSanPham(String hangSanPham);

    @Query("SELECT sp FROM SanPham sp WHERE sp.tenSanPham=?1 AND sp.hangSanPham=?2")
    public List<SanPham> findByHangAndTen(String tenSanPham, String hangSanPham);

    @Query("SELECT sp FROM SanPham sp WHERE sp.loaiSanPham=?1")
    public List<SanPham> findByLoaiSanPham(String loaiSanPham);

    @Query("SELECT sp FROM SanPham sp WHERE sp.tenSanPham=?1 AND sp.hangSanPham=?2")
    public SanPham ifSanPhamExisted(String tenSanPham, String hangSanPham);

    public boolean existsByThongTinSanPham(String thongTin);

    List<SanPham> findByTenSanPhamContaining(String keyword);
}
