package com.thanhttt.baitaplon;

import java.text.ParseException;
import java.util.Date;

public class BaoCaoThucTap extends BaoCao{
    private String danhGiaCuaDN;

    public BaoCaoThucTap() {
    }

    public BaoCaoThucTap(String tenBC, String link, String ngayBC, GiangVien gvHuongDan) throws ParseException {
        super(tenBC, link, ngayBC, gvHuongDan);
    }

    public String getDanhGiaCuaDN() {
        return danhGiaCuaDN;
    }

    public void setDanhGiaCuaDN(String danhGiaCuaDN) {
        this.danhGiaCuaDN = danhGiaCuaDN;
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Danh gia cua doanh nghiep:\n\t- %s\n", danhGiaCuaDN);
    }
}
