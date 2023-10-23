package com.thanhttt.baitaplon;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class HoiDongBaoVe {
    private static int dem;
    private String maHD;
    {
        maHD = (String.format("HD%04d", ++dem));
    }
    private Date ngayLamViec;
    private List<BaoCaoKhoaLuan> danhSachKhoaLuan = new ArrayList<>();
    
    public HoiDongBaoVe(){
    }

    public HoiDongBaoVe(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

        
    public void hienThi(){
        System.out.printf("Ma hoi dong: %s\nNgay lam viec: %s\nDanh sach khoa luan:\n", maHD, CauHinh.f.format(ngayLamViec));
        this.getDanhSachKhoaLuan().forEach(k -> System.out.printf(k.getMaBC() + "\n"));
    }

    public String getMaHD() {
        return maHD;
    }

    public Date getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(Date ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }

    public List<BaoCaoKhoaLuan> getDanhSachKhoaLuan() {
        return danhSachKhoaLuan;
    }

    public void setDanhSachKhoaLuan(List<BaoCaoKhoaLuan> danhSachKhoaLuan) {
        this.danhSachKhoaLuan = danhSachKhoaLuan;
    }
}
