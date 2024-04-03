package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.NhaCungCap;
import com.example.QuanLyNhapXuatKho.repository.NhaCungCapRepository;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService {
    @Autowired
    NhaCungCapRepository nhaCungCapRepository;

    @Override
    public List<NhaCungCap> getAllNhaCungCap() {
        return nhaCungCapRepository.findAll();
    }

    @Override
    public NhaCungCap saveNhaCungCap(NhaCungCap nhaCungCap) {
        return nhaCungCapRepository.save(nhaCungCap);
    }

    @Override
    public NhaCungCap getNhaCungCap(Long maNhaCungCap) {
        return nhaCungCapRepository.findById(maNhaCungCap).get();
    }

    @Override
    public NhaCungCap updateNhaCungCap(NhaCungCap nhaCungCap) {
        return nhaCungCapRepository.save(nhaCungCap);
    }

    @Override
    public void deleteNhaCungCap(Long maNhaCungCap) {
        nhaCungCapRepository.deleteById(maNhaCungCap);
    }

    @Override
    public Boolean ifNhaCungCapExisted(String tenNhaCungCap) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifNhaCungCapExisted'");
    }
    
}
