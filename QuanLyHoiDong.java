/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhttt.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyHoiDong {
    private List<HoiDongBaoVe> danhSachHoiDong = new ArrayList<>();
    
    public void them(HoiDongBaoVe ...h){
        this.danhSachHoiDong.addAll(Arrays.asList(h));
    }
    
    public void xoa(HoiDongBaoVe h){
        this.danhSachHoiDong.removeIf(hd -> hd.equals(h) == true);
    }
    
    public List<HoiDongBaoVe> getDanhSachHoiDong() {
        return this.danhSachHoiDong;
    }

    public void setDanhSachHoiDong(List<HoiDongBaoVe> ds) {
        this.danhSachHoiDong = ds;
    }
    
    public void hienThi(){
        for (HoiDongBaoVe hd: danhSachHoiDong){
            hd.hienThi();
            System.out.println("--------------");
        }
    }
    
    public List<HoiDongBaoVe> timTheoNgayBaoVe(Date d){
        List<HoiDongBaoVe> kq = new ArrayList<HoiDongBaoVe>();
        for (HoiDongBaoVe hd: danhSachHoiDong)
            if (hd.getNgayLamViec().getTime() == d.getTime())
                kq.add(hd);
        return kq;
    }
    
     public List<HoiDongBaoVe> timTheoNgayBaoVe(Date d1, Date d2){
        List<HoiDongBaoVe> kq = new ArrayList<HoiDongBaoVe>();
        for (HoiDongBaoVe hd: danhSachHoiDong)
            if (hd.getNgayLamViec().getTime() >= d1.getTime() && hd.getNgayLamViec().getTime() <= d2.getTime())
                kq.add(hd);
        return kq;
    }
}
