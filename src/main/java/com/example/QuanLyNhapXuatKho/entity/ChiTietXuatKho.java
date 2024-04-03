package com.example.QuanLyNhapXuatKho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "chitietxuatkhos")
public class ChiTietXuatKho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long maXuatKho;
    @Column
    private Long maSanPham;
    @Column
    private int soLuong;
    @Column
    private Long donGia;
    
    public ChiTietXuatKho(Long maXuatKho, Long maSanPham, int soLuong, Long donGia) {
        this.maXuatKho = maXuatKho;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public ChiTietXuatKho(int soLuong, Long donGia) {
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
}
