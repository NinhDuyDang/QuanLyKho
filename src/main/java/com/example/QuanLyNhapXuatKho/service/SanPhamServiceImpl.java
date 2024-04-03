package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.SanPham;
import com.example.QuanLyNhapXuatKho.repository.SanPhamRepository;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Override
    public List<SanPham> getAllSanPham() {
        return sanPhamRepository.findAll();
    }

    @Override
    public SanPham saveSanPham(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    @Override
    public SanPham getSanPham(Long maSanPham) {
        return sanPhamRepository.findById(maSanPham).get();
    }

    @Override
    public SanPham updateSanPham(SanPham sanPham) {
        return sanPhamRepository.save(sanPham);
    }

    @Override
    public void deleteSanPham(Long maSanPham) {
        sanPhamRepository.deleteById(maSanPham);
    }

    @Override
    public Boolean ifSanPhamExisted(String tenSanPham) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifSanPhamExisted'");
    }
    
}
