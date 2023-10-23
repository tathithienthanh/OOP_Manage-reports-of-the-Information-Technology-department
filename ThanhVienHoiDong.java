/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhttt.baitaplon;

/**
 *
 * @author Admin
 */
public class ThanhVienHoiDong {
    private GiangVien thanhVien;
    private HoiDongBaoVe hoiDong;
    private VaiTroHoiDong nhiemVu;

    public ThanhVienHoiDong(GiangVien thanhVien, HoiDongBaoVe hoiDong, String nhiemVu) {
        this.thanhVien = thanhVien;
        this.hoiDong = hoiDong;
        setNhiemVu(nhiemVu);
    }
    
    public void hienThi(){
        System.out.printf("Ma thanh vien: %s\nMa hoi dong: %s\nNhiem vu: %s\n", this.thanhVien.getMaGV(), this.hoiDong.getMaHD(), this.nhiemVu.getTen());    
    }

    public GiangVien getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(GiangVien thanhVien) {
        this.thanhVien = thanhVien;
    }

    public HoiDongBaoVe getHoiDong() {
        return hoiDong;
    }

    public void setHoiDong(HoiDongBaoVe hoiDong) {
        this.hoiDong = hoiDong;
    }

    public VaiTroHoiDong getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(VaiTroHoiDong nhiemVu) {
        this.nhiemVu = nhiemVu;
    }
    
    public void setNhiemVu(String nv) {
        if ("Chu tich".equals(nv) || "chu tich".equals(nv) || "CHU TICH".equals(nv))
            this.nhiemVu = VaiTroHoiDong.CHU_TICH;
        else if ("Phan bien".equals(nv) || "phan bien".equals(nv) || "PHAN BIEN".equals(nv))
            this.nhiemVu = VaiTroHoiDong.PHAN_BIEN;
        else if ("Thu ky".equals(nv) || "thu ky".equals(nv) || "THU KY".equals(nv))
            this.nhiemVu = VaiTroHoiDong.THU_KY;
        else if ("Uy vien".equals(nv) || "uy vien".equals(nv) || "UY VIEN".equals(nv))
            this.nhiemVu = VaiTroHoiDong.UY_VIEN;
    }

}
