package com.thanhttt.baitaplon;

public class SinhVienLamBaoCao {
    private SinhVien sinhVien;
    private BaoCao baoCao;

    public SinhVienLamBaoCao(SinhVien sinhVien, BaoCao baoCao) {
        this.sinhVien = sinhVien;
        this.baoCao = baoCao;
    }
        
    public void hienThi(){
        System.out.printf("Ma so sinh vien: %s\nMa bao cao: %s\n", getSinhVien().getMaSV(), getBaoCao().getMaBC());
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public BaoCao getBaoCao() {
        return baoCao;
    }

    public void setBaoCao(BaoCao baoCao) {
        this.baoCao = baoCao;
    }
}
