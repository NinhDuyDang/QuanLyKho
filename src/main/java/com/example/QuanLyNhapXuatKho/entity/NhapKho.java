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
@Table(name = "nhapkhos")
public class NhapKho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maNhapKho;
    @Column
    private Long maNhanVien;
    @Column
    private Long maNhaCungCap;
    @Column
    private String ngayNhap;
    @Column
    private Long tongSoTien;

    public NhapKho(String ngayNhap, Long tongSoTien) {
        this.ngayNhap = ngayNhap;
        this.tongSoTien = tongSoTien;
    }
}
