package com.thanhttt.baitaplon;

public enum HocHam {
    GIAO_SU("Giao su", "GS."),
    PHO_GIAO_SU("Pho giao su", "PGS.");
    
    private String ten, tenVietTat;

    private HocHam(String ten, String tenVietTat) {
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
