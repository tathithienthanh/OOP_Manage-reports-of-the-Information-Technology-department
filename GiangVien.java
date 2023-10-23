package com.thanhttt.baitaplon;

import java.text.ParseException;
import java.util.Date;

public class GiangVien {
    private static int dem;
    private String maGV, hoGV, tenGV;
    private GioiTinh gioiTinh;
    private Date namSinh;
    private HocHam hocHam;
    private HocVi hocVi;

    public GiangVien() {
    }

    public GiangVien(String hoGV, String tenGV, GioiTinh gioiTinh, Date namSinh, HocHam hocHam, HocVi hocVi) {
        this.hoGV = hoGV;
        this.tenGV = tenGV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        maGV = String.format("GV%04d", ++dem);

    }
    
    public GiangVien(String hoGV, String tenGV, String gioiTinh, String namSinh, String hocHam, String hocVi) throws ParseException {
        this.hoGV = hoGV;
        this.tenGV = tenGV;
        setGioiTinh(gioiTinh);
        setNamSinh(namSinh);
        setHocHam(hocHam);
        setHocVi(hocVi);
        maGV = String.format("GV%04d", ++dem);
    }

    public String getHoGV() {
        return hoGV;
    }

    public void setHoGV(String hoGV) {
        this.hoGV = hoGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
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
        else if ("Nu".equals(gioiTinh) || "nu".equals(gioiTinh) || gioiTinh == "NU")
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

    public HocHam getHocHam() {
        return hocHam;
    }
    
    public void setHocHam(HocHam hocHam) {
        this.hocHam = hocHam;
    }
    
    public void setHocHam(String hocHam) {
        try {
            if ("GS".equals(hocHam) || "Giao su".equals(hocHam) || "giao su".equals(hocHam) || "Giao Su".equals(hocHam) || "GIAO SU".equals(hocHam) || "GIAO_SU".equals(hocHam))
                this.hocHam = HocHam.GIAO_SU;
            else if ("PGS".equals(hocHam) || "Pho giao su".equals(hocHam) || "pho giao su".equals(hocHam) || "Pho Giao Su".equals(hocHam) || "PHO GIAO SU".equals(hocHam) || "PHO_GIAO_SU".equals(hocHam))
                this.hocHam = HocHam.PHO_GIAO_SU;
        }
        catch(IllegalArgumentException e){
            System.out.println("Du lieu nhap vao khong hop le!");
        }
    }

    public HocVi getHocVi() {
        return hocVi;
    }

    public void setHocVi(HocVi hocVi) {
        this.hocVi = hocVi;
    }
    
    public void setHocVi(String hocVi){
        try{
            if (null != hocVi)
                switch (hocVi) {
                case "ThS":
                case "Thac si":
                case "thac si":
                case "Thac Si":
                case "THAC SI":
                case "THAC_SI":
                    this.hocVi = HocVi.THAC_SI;
                    break;
                case "TS":
                case "Tien si":
                case "tien si":
                case "Tien Si":
                case "TIEN SI":
                case "TIEN_SI":
                    this.hocVi = HocVi.TIEN_SI;
                    break;
                default:
                    break;
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Du lieu nhap vao khong hop le!");
        }
    }

    public String getMaGV() {
        return maGV;
    }
    
    public void hienThi() {
        System.out.printf("\tMa so giang vien: %s\n", maGV);
        System.out.printf("\tHo va ten: %s %s %s\n", this.hocVi.getTenVietTat(), hoGV, tenGV);
        System.out.printf("\tGioi tinh: %s\n", this.gioiTinh.getTen());
        System.out.printf("\tNgay thang nam sinh: %s\n", CauHinh.f.format(namSinh));
        System.out.printf("\tHoc ham: %s\n", this.hocHam.getTen());
        System.out.printf("\tHoc vi: %s\n", this.hocVi.getTen());
    }
}
