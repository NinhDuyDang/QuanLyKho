package com.example.QuanLyNhapXuatKho.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.QuanLyNhapXuatKho.entity.NhaCungCap;

@Repository
public interface NhaCungCapRepository extends JpaRepository<NhaCungCap, Long> {
    @Query("SELECT ncc FROM NhaCungCap ncc WHERE ncc.tenNhaCungCap=?1")
    public NhaCungCap findByTenNhaCungCap(String tenNhaCungCap);
}
