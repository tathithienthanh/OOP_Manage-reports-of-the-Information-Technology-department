package com.thanhttt.baitaplon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuanLyDiem {
    private List<DiemCuaTVHD> danhSachDiem = new ArrayList<>();

    public QuanLyDiem() {
    }

    public QuanLyDiem(List<DiemCuaTVHD> danhSachDiem) {
        this.danhSachDiem = danhSachDiem;
    }
    
    public QuanLyDiem(DiemCuaTVHD... diemTVHD) {
        this.danhSachDiem.addAll(Arrays.asList(diemTVHD));
    }

    public List<DiemCuaTVHD> getDanhSachDiem() {
        return danhSachDiem;
    }

    public void setDanhSachDiem(List<DiemCuaTVHD> danhSachDiem) {
        this.danhSachDiem = danhSachDiem;
    }
    
    public void them(DiemCuaTVHD... diemTVHD) {
        this.danhSachDiem.addAll(Arrays.asList(diemTVHD));
    }
    
    public void xoa(DiemCuaTVHD diemTVHD){
        this.danhSachDiem.removeIf(d -> d.equals(diemTVHD) == true);
    }
    
    public List<Double> diemBaoCao(QuanLyDiem list, BaoCao bc){
        List<Double> diem = new ArrayList<>();
        for (var x: list.getDanhSachDiem()){
            if (x.getBaoCao().equals(bc))
                diem.add(x.getDiem());
        }
        return diem;
    }
}
