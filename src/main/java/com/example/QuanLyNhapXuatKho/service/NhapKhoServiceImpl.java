package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.NhapKho;
import com.example.QuanLyNhapXuatKho.repository.NhapKhoRepository;

@Service
public class NhapKhoServiceImpl implements NhapKhoService {
    @Autowired
    NhapKhoRepository nhapKhoRepository;

    @Override
    public List<NhapKho> getAllNhapKho() {
        return nhapKhoRepository.findAll();
    }

    @Override
    public NhapKho saveNhapKho(NhapKho nhapKho) {
        return nhapKhoRepository.save(nhapKho);
    }

    @Override
    public NhapKho getNhapKho(Long maNhapKho) {
        return nhapKhoRepository.findById(maNhapKho).get();
    }

    @Override
    public NhapKho updateNhapKho(NhapKho nhapKho) {
        return nhapKhoRepository.save(nhapKho);
    }

    @Override
    public void deleteNhapKho(Long maNhapKho) {
        nhapKhoRepository.deleteById(maNhapKho);
    }

    @Override
    public Boolean ifNhapKhoExisted(String tenNhapKho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifNhapKhoExisted'");
    }
    
}
