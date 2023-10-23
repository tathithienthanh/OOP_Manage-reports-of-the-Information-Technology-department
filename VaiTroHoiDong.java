package com.thanhttt.baitaplon;

public enum VaiTroHoiDong {
    CHU_TICH("Chu tich"),
    THU_KY("Thu ky"),
    PHAN_BIEN("Giang vien phan bien"),
    UY_VIEN("Uy vien");
    
    private String ten;

    private VaiTroHoiDong(String ten) {
        this.ten = ten;
    }
    
    public String getTen(){
        return this.ten;
    }
}
