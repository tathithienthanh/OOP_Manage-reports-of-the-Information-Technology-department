package com.thanhttt.baitaplon;

public enum ChuyenNganh {
    CNTT("Cong nghe thong tin"),
    KHMT("Khoa hoc may tinh"),
    HTTTQL("He thong thong tin quan ly");
    
    private String ten;

    private ChuyenNganh(String ten) {
        this.ten = ten;
    }
    
    public String getTen(){
        return this.ten;
    }
}
