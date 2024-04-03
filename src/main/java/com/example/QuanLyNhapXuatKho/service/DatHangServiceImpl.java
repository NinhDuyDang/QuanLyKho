package com.example.QuanLyNhapXuatKho.service;

import com.example.QuanLyNhapXuatKho.entity.DatHang;
import com.example.QuanLyNhapXuatKho.repository.DatHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatHangServiceImpl implements DatHangService{
    @Autowired
    private DatHangRepository datHangRepository;
    @Override
    public List<DatHang> getAllDatHang() {
        return datHangRepository.findAll();
    }

    @Override
    public DatHang saveDatHang(DatHang datHang) {
        return datHangRepository.save(datHang);
    }

    @Override
    public DatHang getDatHang(Long maDatHang) {
        return datHangRepository.findById(maDatHang).get();
    }

    @Override
    public DatHang updateDatHang(DatHang datHang) {
        return datHangRepository.save(datHang);
    }

    @Override
    public void deleteDatHang(Long maDatHang) {
        datHangRepository.deleteById(maDatHang);
    }
}
