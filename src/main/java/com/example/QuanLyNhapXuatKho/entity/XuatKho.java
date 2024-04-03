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
@Table(name = "xuatkhos")
public class XuatKho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maXuatKho;
    @Column
    private Long maNhanVien;
    @Column
    private Long maKhachHang;
//    @Column
//    private String soDienThoai;
    @Column
    private String ngayNhap;
    @Column
    private Long tongSoTien;
    
    public XuatKho(String ngayNhap, Long tongSoTien) {
        this.ngayNhap = ngayNhap;
        this.tongSoTien = tongSoTien;
    }
}
