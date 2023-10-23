package com.thanhttt.baitaplon;

import java.text.ParseException;

public class BaoCaoDoAn extends BaoCao{
    private double tyLeDaoVan;

    public BaoCaoDoAn() {
    }
    
    public BaoCaoDoAn(String tenBC, String link, String ngayBC, GiangVien gvHuongDan) throws ParseException {
        super(tenBC, link, ngayBC, gvHuongDan);
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
       System.out.printf("Ty le dao van: %f\n", getTyLeDaoVan());
   }
}
