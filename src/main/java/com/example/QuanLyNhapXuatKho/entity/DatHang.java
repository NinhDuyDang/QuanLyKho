package com.example.QuanLyNhapXuatKho.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dathangs")
public class DatHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maDatHang;
    @Column
    private Long maKhachHang;
    @Column
    private Long maSanPham;
    @Column
    private int soLuong;
    @Column
    private String ngayDat;
    @Column
    private Long tongTien;

    public DatHang(Long maKhachHang, Long maSanPham, int soLuong, String ngayDat) {
        this.maKhachHang = maKhachHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.ngayDat = ngayDat;
    }
}
