/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhttt.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyThanhVienHoiDong {
    private List<ThanhVienHoiDong> danhSachThanhVienHoiDong = new ArrayList<>();
    
    public void them(ThanhVienHoiDong ...t){
        this.danhSachThanhVienHoiDong.addAll(Arrays.asList(t));
    }
    
    public void xoa(ThanhVienHoiDong t){
        this.danhSachThanhVienHoiDong.removeIf(tv -> tv.equals(t) == true);
    }
    
    public List<ThanhVienHoiDong> getDanhSachThanhVienHoiDong() {
        return danhSachThanhVienHoiDong;
    }

    public void setDanhSachThanhVienHoiDong(List<ThanhVienHoiDong> ds) {
        this.danhSachThanhVienHoiDong = ds;
    }
    
    public List<ThanhVienHoiDong> getDSTheoHoiDong(String maHD){
        List<ThanhVienHoiDong> kq = new ArrayList<>();
        for (ThanhVienHoiDong tv: this.getDanhSachThanhVienHoiDong())
            if (tv.getHoiDong().getMaHD().equals(maHD))
                kq.add(tv);
        return kq;
    }
    
    public void hienThi(){
        for (ThanhVienHoiDong t: danhSachThanhVienHoiDong){
            t.hienThi();
            System.out.println("--------------");
        }
    }
}
