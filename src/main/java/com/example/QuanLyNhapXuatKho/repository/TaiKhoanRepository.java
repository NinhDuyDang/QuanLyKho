package com.example.QuanLyNhapXuatKho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuanLyNhapXuatKho.entity.TaiKhoan;

import java.util.List;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Long> {
    @Query("SELECT tk FROM TaiKhoan tk WHERE tk.tenTaiKhoan=?1")
    public TaiKhoan findByTenTaiKhoan(String tenTaiKhoan);

    @Query("SELECT tk FROM TaiKhoan tk WHERE tk.soDienThoai=?1")
    public TaiKhoan findBySoDienThoai(String soDienThoai);

    @Query("SELECT tk FROM TaiKhoan tk WHERE tk.chucVu=?1")
    public TaiKhoan findByChucVu(String chucVu);

    boolean existsByTenTaiKhoan(String TenTaiKhoan);
    boolean existsBySoDienThoai(String SoDienThoai);

    List<TaiKhoan> findByHoTenContaining(String keyword);
}
