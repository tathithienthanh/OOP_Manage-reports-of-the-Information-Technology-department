package com.thanhttt.baitaplon;

public enum GioiTinh {
    NAM("Nam"),
    NU("Nu"),
    KHAC("Khac");
    
    private String ten;

    private GioiTinh(String ten) {
        this.ten = ten;
    }
    
    public String getTen(){
        return this.ten;
    }
}