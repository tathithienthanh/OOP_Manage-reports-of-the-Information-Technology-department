package com.thanhttt.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLyGiangVien {
    private List<GiangVien> danhSachGV = new ArrayList<>();
    
    public void them(GiangVien ...g){
        this.danhSachGV.addAll(Arrays.asList(g));
    }
    
    public void xoa(GiangVien g){
        this.danhSachGV.removeIf(gv -> gv.equals(g) == true);
    }
    
    public List<GiangVien> getDanhSachGV() {
        return this.danhSachGV;
    }

    public void setDanhSachGV(List<GiangVien> ds) {
        this.danhSachGV = danhSachGV;
    }
    
    public void hienThi(){
        for (GiangVien gv: danhSachGV){
            gv.hienThi();
            System.out.println("--------------");
        }
    }
}
