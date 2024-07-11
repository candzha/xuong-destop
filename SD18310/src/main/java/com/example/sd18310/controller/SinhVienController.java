package com.example.sd18310.controller;

import com.example.sd18310.Entity.SinhVien;
import com.example.sd18310.Service.SinhVienService;
import com.example.sd18310.Service.impl.SinhVienImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienImpl() ;

    @GetMapping("/sinh-vien")
    public String sinhVien(){
        ArrayList<SinhVien> list = sinhVienService.getList();
        for (SinhVien sv:list
             ) {
            System.out.println(sv.toString());
        }
        return "";
    }
}
