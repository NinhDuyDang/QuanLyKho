package com.example.QuanLyNhapXuatKho.repository;

import com.example.QuanLyNhapXuatKho.entity.DatHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatHangRepository extends JpaRepository<DatHang, Long> {
    @Query("SELECT dh FROM DatHang dh WHERE dh.maKhachHang=?1")
    public List<DatHang> findByMaKhachHang(Long maKhachHang);
}
