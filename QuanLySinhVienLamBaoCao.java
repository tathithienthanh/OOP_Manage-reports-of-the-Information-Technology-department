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
public class QuanLySinhVienLamBaoCao {
    private List<SinhVienLamBaoCao> danhSachSVLamBaoCao = new ArrayList<>();
    
    public void them(SinhVienLamBaoCao ...s){
        this.danhSachSVLamBaoCao.addAll(Arrays.asList(s));
    }
    
    public void xoa(SinhVienLamBaoCao s){
        this.danhSachSVLamBaoCao.removeIf(sv -> sv.equals(s) == true);
    }
    
    public List<SinhVienLamBaoCao> getDanhSachSVLamBaoCao() {
        return danhSachSVLamBaoCao;
    }

    public void setDanhSachSVLamBaoCao(List<SinhVienLamBaoCao> ds) {
        this.danhSachSVLamBaoCao = ds;
    }
    
    public List<SinhVienLamBaoCao> getDSTheoBaoCao(String maBC){
        List<SinhVienLamBaoCao> kq = new ArrayList<>();
        for (SinhVienLamBaoCao sv: this.danhSachSVLamBaoCao)
            if (sv.getBaoCao().getMaBC() == maBC)
                kq.add(sv);
        return kq;
    }
    
    public void hienThi(){
        for (SinhVienLamBaoCao sv: danhSachSVLamBaoCao){
            sv.hienThi();
            System.out.println("--------------");
        }
    }
}
