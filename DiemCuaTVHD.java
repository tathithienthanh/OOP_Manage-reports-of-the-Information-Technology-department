package com.thanhttt.baitaplon;

public class DiemCuaTVHD {
    private ThanhVienHoiDong thanhVien;
    private HoiDongBaoVe doiDong;
    private BaoCao baoCao;
    private double diem;

    public DiemCuaTVHD() {
    }

    public DiemCuaTVHD(ThanhVienHoiDong thanhVien, HoiDongBaoVe doiDong, BaoCao baoCao, double diem) {
        this.thanhVien = thanhVien;
        this.doiDong = doiDong;
        this.baoCao = baoCao;
        this.diem = diem;
    }

    public ThanhVienHoiDong getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVienHoiDong thanhVien) {
        this.thanhVien = thanhVien;
    }

    public HoiDongBaoVe getDoiDong() {
        return doiDong;
    }

    public void setDoiDong(HoiDongBaoVe doiDong) {
        this.doiDong = doiDong;
    }

    public BaoCao getBaoCao() {
        return baoCao;
    }

    public void setBaoCao(BaoCao baoCao) {
        this.baoCao = baoCao;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
