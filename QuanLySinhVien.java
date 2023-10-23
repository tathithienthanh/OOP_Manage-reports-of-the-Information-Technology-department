package com.thanhttt.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLySinhVien {
    private List<SinhVien> danhSachSV = new ArrayList<>();
    
    public void them(SinhVien ...s){
        this.danhSachSV.addAll(Arrays.asList(s));
    }
    
    public void xoa(SinhVien s){
        this.danhSachSV.removeIf(sv -> sv.equals(s) == true);
    }
    
    public List<SinhVien> getDanhSachSV() {
        return danhSachSV;
    }

    public void setDanhSachSV(List<SinhVien> ds) {
        this.danhSachSV = ds;
    }
    
    public void hienThi(){
        for (SinhVien sv: danhSachSV){
            sv.hienThi();
            System.out.println("--------------");
        }
    }
}
