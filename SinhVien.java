package com.thanhttt.baitaplon;

import java.text.ParseException;
import java.util.Date;

public class SinhVien {
    private static int dem;
    private String maSV, hoSV, tenSV;
    private int khoaHoc;
    private GioiTinh gioiTinh;
    private Date namSinh;
    private ChuyenNganh chuyenNganh;
    
    {
        maSV = String.format("%d5101%04d", khoaHoc, ++dem);
    }

    public SinhVien() {
    }
    
    public SinhVien(String hoSV, String tenSV, int khoaHoc, GioiTinh gioiTinh, Date namSinh, ChuyenNganh chuyenNganh) {
        this.hoSV = hoSV;
        this.tenSV = tenSV;
        this.khoaHoc = khoaHoc;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
    }
    
    public SinhVien(String hoSV, String tenSV, int khoaHoc, String gioiTinh, String namSinh, String chuyenNganh) throws ParseException {
        this.hoSV = hoSV;
        this.tenSV = tenSV;
        this.khoaHoc = khoaHoc;
        setGioiTinh(gioiTinh);
        setNamSinh(namSinh);
        setChuyenNganh(chuyenNganh);
    }
    
    public String getHoSV() {
        return hoSV;
    }

    public void setHoSV(String hoSV) {
        this.hoSV = hoSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }
    
    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void setGioiTinh(String gioiTinh) {
        if ("Nam".equals(gioiTinh) || "nam".equals(gioiTinh) || "NAM".equals(gioiTinh))
            this.gioiTinh = GioiTinh.NAM;
        else if ("Nu".equals(gioiTinh) || "nu".equals(gioiTinh) || "NU".equals(gioiTinh))
            this.gioiTinh = GioiTinh.NU;
        else if ("Khac".equals(gioiTinh) || "khac".equals(gioiTinh) || "KHAC".equals(gioiTinh))
            this.gioiTinh = GioiTinh.KHAC;
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh = namSinh;
    }
    
    public void setNamSinh(String namSinh) throws ParseException {
        this.namSinh = CauHinh.f.parse(namSinh);
    }

    public ChuyenNganh getChuyenNganh() {
        return chuyenNganh;
    }     

    public void setChuyenNganh(ChuyenNganh chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    public void setChuyenNganh(String chuyenNganh){
        try{
            if (null != chuyenNganh)
                switch (chuyenNganh) {
                case "CNTT":
                    this.chuyenNganh = ChuyenNganh.CNTT;
                    break;
                case "KHMT":
                    this.chuyenNganh = ChuyenNganh.KHMT;
                    break;
                case "HTTTQL":
                    this.chuyenNganh = ChuyenNganh.HTTTQL;
                    break;
                default:
                    break;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Du lieu nhap vao khong hop le!");
        }
    }

    public String getMaSV() {
        return maSV;
    }
    
    public void hienThi(){
        System.out.printf("\tMa so sinh vien: %s\n", maSV);
        System.out.printf("\tHo va ten: %s %s\n", hoSV, tenSV);
        System.out.printf("\tKhoa hoc: %d\n", khoaHoc);
        System.out.printf("\tGioi tinh: %s\n", this.gioiTinh.getTen());
        System.out.printf("\tNgay thang nam sinh: %s\n", CauHinh.f.format(namSinh));
        System.out.printf("\tChuyen nganh: %s\n", this.chuyenNganh.getTen());
    }
}
