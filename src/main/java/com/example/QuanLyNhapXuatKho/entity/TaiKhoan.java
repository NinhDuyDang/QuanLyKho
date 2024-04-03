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
@Table(name = "taikhoans")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maTaiKhoan;
    @Column
    private String tenTaiKhoan;
    @Column
    private String matKhau;
    @Column
    private String reMatKhau;
    @Column
    private String hoTen;
    @Column
    private String cccd;
    @Column
    private String soDienThoai;
    @Column
    private Long luong;
    @Column
    private Long tienXuat;
    @Column
    private Long tienNhap;
    @Column
    private String queQuan;
    @Column
    private String ngaySinh;
    @Column
    private String ngayVaoLam;
    @Column
    private int diemThuong;
    @Column
    private String chucVu;
    @Column
    private Role role;

    public TaiKhoan(String tenTaiKhoan, String matKhau, String reMatKhau, String hoTen, String cccd, String soDienThoai,
            Long luong, Long tienXuat, Long tienNhap, String queQuan, String ngaySinh, String ngayVaoLam, int diemThuong, String chucVu, Role role) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.reMatKhau = reMatKhau;
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.soDienThoai = soDienThoai;
        this.luong = luong;
        this.tienXuat = tienXuat;
        this.tienNhap = tienNhap;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.diemThuong = diemThuong;
        this.chucVu = chucVu;
        this.role = role;
    }
}
