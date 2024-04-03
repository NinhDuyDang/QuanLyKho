package com.example.QuanLyNhapXuatKho.repository;

import com.example.QuanLyNhapXuatKho.entity.ChiTietNhapKho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuanLyNhapXuatKho.entity.ChiTietXuatKho;

import java.util.List;

@Repository
public interface ChiTietXuatKhoRepository extends JpaRepository<ChiTietXuatKho, Long> {
    @Query("SELECT ct FROM ChiTietXuatKho ct WHERE ct.maXuatKho=?1")
    public List<ChiTietXuatKho> findByMaXuatKho(Long maXuatKho);

    @Query("SELECT ct FROM ChiTietXuatKho ct WHERE ct.maSanPham=?1")
    public ChiTietXuatKho ifChiTietExistedSanPham(Long maSanPham);
}
