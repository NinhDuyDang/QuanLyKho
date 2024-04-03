package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.TaiKhoan;
import com.example.QuanLyNhapXuatKho.repository.TaiKhoanRepository;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    TaiKhoanRepository taiKhoanRepository;

    @Override
    public List<TaiKhoan> getAllTaiKhoan() {
        return taiKhoanRepository.findAll();
    }

    @Override
    public TaiKhoan saveTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanRepository.save(taiKhoan);
    }

    @Override
    public TaiKhoan getTaiKhoan(Long maTaiKhoan) {
        return taiKhoanRepository.findById(maTaiKhoan).get();
    }

    @Override
    public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanRepository.save(taiKhoan);
    }

    @Override
    public void deleteTaiKhoan(Long maTaiKhoan) {
        taiKhoanRepository.deleteById(maTaiKhoan);
    }

    @Override
    public Boolean ifTaiKhoanExisted(String tenTaiKhoan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifTaiKhoanExisted'");
    }
    
}
