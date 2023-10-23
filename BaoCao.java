package com.thanhttt.baitaplon;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class BaoCao {
    private static int dem;
    private String maBC, tenBC, link;
    private Date ngayBC;
    private GiangVien gvHuongDan;
    private double diemBC;
    {
        this.maBC = String.format("BC%04d", ++dem);
    }

    public BaoCao() {
    }

    public BaoCao(String tenBC, String link, Date ngayBC, GiangVien gvHuongDan) {
        this.tenBC = tenBC;
        this.link = link;
        this.ngayBC = ngayBC;
        this.gvHuongDan = gvHuongDan;
    }
    
    public BaoCao(String tenBC, String link, String ngayBC, GiangVien gvHuongDan) throws ParseException {
        this.tenBC = tenBC;
        this.link = link;
        setNgayBC(ngayBC);
        this.gvHuongDan = gvHuongDan;
    }

    public String getMaBC() {
        return maBC;
    }

    public void setMaBC(String maBC) {
        this.maBC = maBC;
    }

    public String getTenBC() {
        return tenBC;
    }

    public void setTenBC(String tenBC) {
        this.tenBC = tenBC;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getNgayBC() {
        return ngayBC;
    }

    public void setNgayBC(Date ngayBC) {
        this.ngayBC = ngayBC;
    }
    
    public void setNgayBC(String ngayBC) throws ParseException {
        this.ngayBC = CauHinh.f.parse(ngayBC);
    }

    public GiangVien getGvHuongDan() {
        return gvHuongDan;
    }

    public void setGvHuongDan(GiangVien gvHuongDan) {
        this.gvHuongDan = gvHuongDan;
    }

    public double getDiemBC() {
        return diemBC;
    }

    public void setDiemBC(double diemBC) {
        this.diemBC = diemBC;
    }
    
    public void setDiemBC(List<Double> diemThanhPhan) {
        this.diemBC = 0;
        for (double x: diemThanhPhan){
            this.diemBC += x;
        }
        this.diemBC /= diemThanhPhan.size();
    }
    
    public void hienThi(){
        System.out.printf("Ma bao cao: %s\n", maBC);
        System.out.printf("Ten bao cao: %s\n", tenBC);
        System.out.printf("Duong dan: %s\n", link);
        System.out.printf("Ngay bao cao: %s\n", CauHinh.f.format(ngayBC));
        System.out.printf("Giang vien huong dan: %s %s %s\n", gvHuongDan.getHocVi().getTenVietTat(), gvHuongDan.getHoGV(), gvHuongDan.getTenGV());
        System.out.printf("Diem bao cao: %.2f\n", diemBC);
    }
}
