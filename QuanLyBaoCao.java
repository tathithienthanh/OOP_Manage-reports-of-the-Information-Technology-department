package com.thanhttt.baitaplon;

import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Collectors;

public class QuanLyBaoCao {
    private List<BaoCao> danhSachBaoCao = new ArrayList<>();
    
    public List<BaoCao> getDanhSachBaoCao() {
        return danhSachBaoCao;
    }

    public void setDanhSachBaoCao(List<BaoCao> ds) {
        this.danhSachBaoCao = ds;
    }
    
    public void them(BaoCao ...b){
        this.getDanhSachBaoCao().addAll(Arrays.asList(b));
    }
    
    public void xoa(String maBC){
        this.getDanhSachBaoCao().removeIf(b -> b.getMaBC().equals(maBC));
    }
    
    public void hienThi(){
        for (BaoCao bc: this.danhSachBaoCao){
            bc.hienThi();
            System.out.println("--------------");
        }
    }
    
    public List<BaoCao> getDSTheoLoai(String s) throws ClassNotFoundException{
        List<BaoCao> kq = new ArrayList<>();
        Class c = Class.forName(s);
        for (BaoCao bc: this.danhSachBaoCao)
            if (c.isInstance(bc) == true)
                kq.add(bc);
        return kq;
    }
    
    public void sapXep(int a){
        switch(a){
            case 1:
                this.danhSachBaoCao.sort(Comparator.comparing(BaoCao::getTenBC));
                break;
            case 2:
                this.danhSachBaoCao.sort(Comparator.comparing(BaoCao::getTenBC).reversed());
                break;
            case 3:
                this.danhSachBaoCao.sort(Comparator.comparing(BaoCao::getNgayBC));
                break;
            case 4:
                this.danhSachBaoCao.sort(Comparator.comparing(BaoCao::getNgayBC).reversed());
                break;
        }
    }
    
    public List<BaoCao> timKiem(String ten){
        return this.danhSachBaoCao.stream().filter(b -> b.getTenBC().equals(ten)).collect(Collectors.toList());
    }
    
    public List<BaoCao> timKiem(Date ngay){
        return this.danhSachBaoCao.stream().filter(b -> b.getNgayBC().getTime() == ngay.getTime()).collect(Collectors.toList());
    }
}
