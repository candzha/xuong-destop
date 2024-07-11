package com.example.sd18310.Service.impl;

import com.example.sd18310.Entity.SinhVien;
import com.example.sd18310.Service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class SinhVienImpl  implements SinhVienService{

    ArrayList<SinhVien> list = new ArrayList<>();
    public SinhVienImpl(){
        list.add(new SinhVien(1,"Nguyen van c","Nam","thi lai"));
        list.add(new SinhVien(1,"Nguyen van c","Nam","thi lai"));
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return list;
    }
}
