package com.thanhttt.baitaplon;

import java.text.ParseException;
import java.util.Date;

public class BaoCaoKhoaLuan extends BaoCao{
    private String danhGiaCuaGVPB;
    private String maHD;
    private double tyLeDaoVan;

    public BaoCaoKhoaLuan() {
    }

    public BaoCaoKhoaLuan(String tenBC, String link, String ngayBC, GiangVien gvHuongDan) throws ParseException {
        super(tenBC, link, ngayBC, gvHuongDan);
        this.maHD = maHD;
    }

    public String getDanhGiaCuaGVPB() {
        return danhGiaCuaGVPB;
    }

    public void setDanhGiaCuaGVPB(String danhGiaCuaGVPB) {
        this.danhGiaCuaGVPB = danhGiaCuaGVPB;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Ma hoi dong: %s\n", maHD);
        System.out.printf("Danh gia cua giang vien phan bien:\n\t- %s\n", danhGiaCuaGVPB);
        System.out.printf("Ty le dao van: %f\n", tyLeDaoVan);
    }
}
