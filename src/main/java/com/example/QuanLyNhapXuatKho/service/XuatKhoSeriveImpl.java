package com.example.QuanLyNhapXuatKho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuanLyNhapXuatKho.entity.XuatKho;
import com.example.QuanLyNhapXuatKho.repository.XuatKhoRepository;

@Service
public class XuatKhoSeriveImpl implements XuatKhoService {
    @Autowired
    XuatKhoRepository xuatKhoRepository;

    @Override
    public List<XuatKho> getAllXuatKho() {
        return xuatKhoRepository.findAll();
    }

    @Override
    public XuatKho saveXuatKho(XuatKho xuatKho) {
        return xuatKhoRepository.save(xuatKho);
    }

    @Override
    public XuatKho getXuatKho(Long maXuatKho) {
        return xuatKhoRepository.findById(maXuatKho).get();
    }

    @Override
    public XuatKho updateXuatKho(XuatKho xuatKho) {
        return xuatKhoRepository.save(xuatKho);
    }

    @Override
    public void deleteXuatKho(Long maXuatKho) {
        xuatKhoRepository.deleteById(maXuatKho);
    }

    @Override
    public Boolean ifXuatKhoExisted(String tenXuatKho) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ifXuatKhoExisted'");
    }
    
}
