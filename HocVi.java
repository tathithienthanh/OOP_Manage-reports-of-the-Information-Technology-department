package com.thanhttt.baitaplon;

public enum HocVi {
    THAC_SI("Thac si", "Ths."),
    TIEN_SI("Tien si", "TS.");
    
    private String ten, tenVietTat;

    private HocVi(String ten, String tenVietTat) {
        this.ten = ten;
        this.tenVietTat = tenVietTat;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getTenVietTat(){
        return this.tenVietTat;
    }
}
