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
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "nhacungcaps")
public class NhaCungCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maNhaCungCap;
    @Column
    private String tenNhaCungCap;
    @Column
    private String soDienThoai;
    @Column
    private String email;
    @Column
    private String diaChi;

    public NhaCungCap(String tenNhaCungCap, String soDienThoai, String email, String diaChi) {
        this.tenNhaCungCap = tenNhaCungCap;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }
}
