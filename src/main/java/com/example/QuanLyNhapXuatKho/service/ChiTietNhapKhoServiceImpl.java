package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.ChiTietNhapKho;
import com.example.QuanLyNhapXuatKho.repository.ChiTietNhapKhoRepository;

@Service
public class ChiTietNhapKhoServiceImpl implements ChiTietNhapKhoService {
    @Autowired
    ChiTietNhapKhoRepository chiTietNhapKhoRepository;
    
    @Override
    public List<ChiTietNhapKho> getAllChiTietNhapKho() {
        return chiTietNhapKhoRepository.findAll();
    }

    @Override
    public ChiTietNhapKho saveChiTietNhapKho(ChiTietNhapKho chiTietNhapKho) {
        return chiTietNhapKhoRepository.save(chiTietNhapKho);
    }

    @Override
    public ChiTietNhapKho getChiTietNhapKho(Long maChiTietNhapKho) {
        return chiTietNhapKhoRepository.findById(maChiTietNhapKho).get();
    }

    @Override
    public ChiTietNhapKho updateChiTietNhapKho(ChiTietNhapKho chiTietNhapKho) {
        return chiTietNhapKhoRepository.save(chiTietNhapKho);
    }

    @Override
    public void deleteChiTietNhapKho(Long maChiTietNhapKho) {
        chiTietNhapKhoRepository.deleteById(maChiTietNhapKho);
    }

    @Override
    public Boolean ifChiTietNhapKhoExisted(String tenChiTietNhapKho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifChiTietNhapKhoExisted'");
    }
    
    
}
