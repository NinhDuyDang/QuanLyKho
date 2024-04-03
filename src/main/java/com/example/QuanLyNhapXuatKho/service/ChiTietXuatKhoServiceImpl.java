package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.ChiTietXuatKho;
import com.example.QuanLyNhapXuatKho.repository.ChiTietXuatKhoRepository;

@Service
public class ChiTietXuatKhoServiceImpl implements ChiTietXuatKhoService {
    @Autowired
    ChiTietXuatKhoRepository chiTietXuatKhoRepository;

    @Override
    public List<ChiTietXuatKho> getAllChiTietXuatKho() {
        return chiTietXuatKhoRepository.findAll();
    }

    @Override
    public ChiTietXuatKho saveChiTietXuatKho(ChiTietXuatKho chiTietXuatKho) {
        return chiTietXuatKhoRepository.save(chiTietXuatKho);
    }

    @Override
    public ChiTietXuatKho getChiTietXuatKho(Long maChiTietXuatKho) {
        return chiTietXuatKhoRepository.findById(maChiTietXuatKho).get();
    }

    @Override
    public ChiTietXuatKho updateChiTietXuatKho(ChiTietXuatKho chiTietXuatKho) {
        return chiTietXuatKhoRepository.save(chiTietXuatKho);
    }

    @Override
    public void deleteChiTietXuatKho(Long maChiTietXuatKho) {
        chiTietXuatKhoRepository.deleteById(maChiTietXuatKho);
    }

    @Override
    public Boolean ifChiTietXuatKhoExisted(String tenChiTietXuatKho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifChiTietXuatKhoExisted'");
    }

}
