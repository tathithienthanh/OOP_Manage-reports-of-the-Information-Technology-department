package com.thanhttt.baitaplon;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;



public class Demo {
   
    public static void main(String[] args) throws ParseException, ClassNotFoundException, FileNotFoundException {
        int chon;
        QuanLySinhVien qlsv = new QuanLySinhVien();
        QuanLyGiangVien qlgv = new QuanLyGiangVien();
        QuanLyBaoCao qlbc = new QuanLyBaoCao();
        QuanLySinhVienLamBaoCao qlsvlbc = new QuanLySinhVienLamBaoCao();
        QuanLyHoiDong qlhd = new QuanLyHoiDong();
        QuanLyThanhVienHoiDong qltvhd = new QuanLyThanhVienHoiDong();
        QuanLyDiem qld = new QuanLyDiem();

        CauHinh ch = new CauHinh();
        ch.inFile(qlgv, "src/main/resources/GiangVien.txt");
        ch.inFile(qlsv, "src/main/resources/SinhVien.txt");
                
        do{
            System.out.printf("----------------------------MENU----------------------------\n"
                              + "1. Them bao cao\n"
                              + "2. Xoa bao cao\n"
                              + "3. Sua thong tin bao cao\n"
                              + "4. Xem thong tin bao cao\n"
                              + "5. Xem danh sach bao cao thuc tap\n"
                              + "6. Xem danh sach bao cao do an\n"
                              + "7. Xem danh sach bao cao khoa luan\n"
                              + "8. Cham diem bao cao thuc tap\n"
                              + "9. Cham diem bao cao do an\n"
                              + "10. Cham diem bao cao khoa luan\n"
                              + "11. Sap xep bao cao\n"
                              + "12. Thanh lap hoi dong bao ve khoa luan\n"
                              + "13. Xem thong tin hoi dong bao ve khoa luan\n"
                              + "14. Tim kiem bao cao theo ten\n"
                              + "15. Tìm kiem bao cao theo ngay bao cao\n"
                              + "16. Tim kiem hoi dong theo ngay bao ve khoa luan\n"
                              + "%d. Thoat\n", CauHinh.MAX_CHOICE);
            
            System.out.print("Chon: ");
            chon = Integer.parseInt(CauHinh.sc.nextLine());
            
            while (chon < 1 || chon > CauHinh.MAX_CHOICE) {
                System.out.print("Khong hop le! Nhap lai: ");
                chon = CauHinh.sc.nextInt();
            }
            
            switch(chon) {
                case 1:
                    String ten, link, ngay, maGV;
                    boolean check = false;
                    GiangVien gv = new GiangVien();
                    System.out.println("------Nhap thong tin bao cao moi------");
                    System.out.print("\tTen bao cao: ");
                    ten = CauHinh.sc.nextLine();
                    System.out.print("\tLink tro toi bao cao: ");
                    link = CauHinh.sc.nextLine();
                    System.out.print("\tNgay bao cao: ");
                    ngay = CauHinh.sc.nextLine();
                    System.out.print("\tMa so giang vien huong dan: ");
                    maGV = CauHinh.sc.nextLine();
                    
                    for(var x: qlgv.getDanhSachGV()){
                        if (x.getMaGV().equals(maGV)) {
                            gv = x;
                            check = true;
                            break;
                        }
                    }
                    
                    if (check){
                        System.out.println("Chon loai bao cao:\n1.Bao cao khoa luan\n2.Bao cao do an\n3. Bao cao thuc tap");
                        System.out.print("Chon: ");
                        int c = Integer.parseInt(CauHinh.sc.nextLine());
                        
                        switch(c){
                            case 1:
                                BaoCao b = new BaoCaoKhoaLuan(ten, link, ngay, gv);
                                qlbc.them(b);
                                break;
                            case 2:
                                BaoCao b1 = new BaoCaoDoAn(ten, link, ngay, gv);
                                qlbc.them(b1);
                                break;
                                        
                            case 3:
                                BaoCao b2 = new BaoCaoThucTap(ten, link, ngay, gv);
                                qlbc.them(b2);
                                break;
                            default:
                                System.out.print("Nhap sai\n");
                                break;

                        }
                        System.out.println("Them bao cao thanh cong!");
                    }
                    else
                        System.out.printf("Khong ton tai giang vien voi ma so '%s'\n", maGV);
                    break;
                case 2:
                    String maBC;
                    check = false;
                    
                    System.out.print("Nhap ma so bao cao can xoa: ");
                    maBC = CauHinh.sc.nextLine();
                    
                   for(var x: qlbc.getDanhSachBaoCao()){
                        if (x.getMaBC().equals(maBC)) {
                            check = true;
                            break;
                        }
                    }
                    
                    if (check){
                        qlbc.xoa(maBC);
                        System.out.println("Xoa bao cao thanh cong!");
                    }
                            
                    else
                        System.out.printf("Khong ton tai bao cao voi ma so '%s'\n", maBC);
                    break;
                case 3:
                    int chon1;
                    String mabc;
                    BaoCao b = new BaoCao();
                    check = false;

                    System.out.print("Nhap ma so bao cao can sua: ");
                    mabc = CauHinh.sc.nextLine();

                    for (BaoCao x : qlbc.getDanhSachBaoCao()) {
                        if (x.getMaBC().equals(mabc)) {
                            b = x;
                            check = true;
                            System.out.print("1. Sua ten bao cao\n"
                                + "2. Sua duong link\n"
                                + "3. Sua ngay bao cao\n"
                                + "4. Sua diem\n"
                                + "5. Sua thong tin sinh vien tham gia\n"
                                + "6. Sua giang vien huong dan\n"
                                + "7. Thoat\n");

                            System.out.print("Ban chon: ");
                            chon1 = Integer.parseInt(CauHinh.sc.nextLine());

                            while (chon1 < 1 || chon1 > 7) {
                                System.out.print("Khong hop le! Nhap lai: ");
                                chon1 = CauHinh.sc.nextInt();
                                break;
                            }
                            switch (chon1) {
                            case 1:
                                System.out.print("Nhap ten moi: ");
                                ten = CauHinh.sc.nextLine();
                                b.setTenBC(ten);
                                break;
                            case 2:
                                System.out.print("Nhap duong link moi: ");
                                link = CauHinh.sc.nextLine();
                                b.setLink(link);
                                break;
                            case 3:
                                System.out.print("Nhap ngay moi: ");
                                ngay = CauHinh.sc.nextLine();
                                b.setNgayBC(ngay);
                                break;
                            case 4:
                                double diem;
                                System.out.print("Nhap diem moi: ");
                                diem = CauHinh.sc.nextDouble();
                                b.setDiemBC(diem);
                                break;
                            case 5:
                                int chon2;

                                System.out.print("1. Them sinh vien\n"
                                        + "2. Xoa sinh vien\n"
                                        + "3. Thoat\n");

                                System.out.print("Ban chon: ");
                                chon2 = Integer.parseInt(CauHinh.sc.nextLine());

                                while (chon2 < 1 || chon2 > 3) {
                                    System.out.print("Khong hop le! Nhap lai: ");
                                    chon2 = CauHinh.sc.nextInt();
                                }

                                switch (chon2) {
                                    case 1:
                                        String masv;
                                        check = false;

                                        System.out.print("Nhap ma sinh vien can them: ");
                                        masv = CauHinh.sc.nextLine();
                                        
                                        for (SinhVien x1: qlsv.getDanhSachSV()){
                                            if (x1.getMaSV().equals(masv)) {
                                                check = true;
                                                if (qlsvlbc.getDSTheoBaoCao(mabc).size() <= 2) {
                                                    SinhVienLamBaoCao svlbc = new SinhVienLamBaoCao(x1, b);
                                                    qlsvlbc.them(svlbc);
                                                    System.out.println("Them sinh vien thanh cong!");
                                                }
                                                else
                                                    System.out.println("So sinh vien da dat toi da!");
                                                break;
                                            }
                                        }
                                        
                                        if (!check)
                                            System.out.println("Khong tim thay sinh vien!");
                                        break;
                                    case 2:
                                        check = false;

                                        System.out.print("Nhap ma sinh vien can xoa: ");
                                        masv = CauHinh.sc.nextLine();
                                        
                                        for (SinhVienLamBaoCao x1: qlsvlbc.getDanhSachSVLamBaoCao()){
                                            if (x1.getSinhVien().getMaSV().equals(masv)) {
                                                check = true;
                                                qlsvlbc.xoa(x1);
                                                System.out.println("Xoa sinh vien thanh cong!");
                                                break;
                                            }
                                        }
                                        
                                        if (!check)
                                            System.out.println("Khong tim thay sinh vien!");
                                        break;
                                    default:
                                        break;
                                }
                                break;
                            case 6:
                                check = false;
                                System.out.print("Nhap ma so giang vien moi: ");
                                String magv = CauHinh.sc.nextLine();

                                for (var x1 : qlgv.getDanhSachGV()) {
                                    if (x1.getMaGV().equals(magv)) {
                                        b.setGvHuongDan(x1);
                                        check = true;
                                        break;
                                    }
                                }
                                if (!check)
                                    System.out.println("Khong tim thay giang vien!");
                                break;
                            default:
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    check = false;
                    System.out.print("Nhap ma so bao cao can xem: ");
                    maBC = CauHinh.sc.nextLine();
                    
                    for(var x: qlbc.getDanhSachBaoCao()){
                        if (x.getMaBC().equals(maBC)) {
                            x.hienThi();
                            check = true;
                            break;
                        }
                    }
                    
                    if (!check)
                        System.out.printf("Khong ton tai bao cao voi ma so '%s'\n", maBC);
                    break;
                case 5:
                    List<BaoCao> ltt = qlbc.getDSTheoLoai("com.thanhttt.baitaplon.BaoCaoThucTap");
                    
                    for (var x: ltt){
                        System.out.println("------------------");
                        x.hienThi();
                    }
                    break;
                case 6:
                    List<BaoCao> lda = qlbc.getDSTheoLoai("com.thanhttt.baitaplon.BaoCaoDoAn");
                    
                    for (var x: lda){
                        System.out.println("------------------");
                        x.hienThi();
                    }
                    break;
                case 7:
                    List<BaoCao> lkl = qlbc.getDSTheoLoai("com.thanhttt.baitaplon.BaoCaoKhoaLuan");
                    
                    for (var x: lkl){
                        System.out.println("------------------");
                        x.hienThi();
                    }
                    break;
                case 8:
                    check = false;
                    double diemTT;
                    System.out.print("Nhap ma bao cao thuc tap can cham diem: ");
                    mabc = CauHinh.sc.nextLine();
                    
                    for (var x: qlbc.getDSTheoLoai("com.thanhttt.baitaplon.BaoCaoThucTap")) {
                        if (x.getMaBC().equals(mabc)) {
                            System.out.print("Nhap diem: ");
                            diemTT = Double.parseDouble(CauHinh.sc.nextLine());
                            x.setDiemBC(diemTT);
                            check = true;
                        }
                    }
                    
                    if (!check)
                        System.out.println("Khong tim thay bao cao!");
                    break;
                case 9:
                    check = false;
                    double diemDA;
                    System.out.print("Nhap ma bao cao do an can cham diem: ");
                    mabc = CauHinh.sc.nextLine();
                    
                    for (var x: qlbc.getDSTheoLoai("com.thanhttt.baitaplon.BaoCaoDoAn")) {
                        if (x.getMaBC().equals(mabc)) {
                            System.out.print("Nhap diem: ");
                            diemDA = Double.parseDouble(CauHinh.sc.nextLine());
                            x.setDiemBC(diemDA);
                            check = true;
                        }
                    }
                    
                    if (!check)
                        System.out.println("Khong tim thay bao cao!");
                    break;
                case 10:
                    check = false;
                    System.out.print("Nhap ma bao cao khoa luan can cham diem: ");
                    mabc = CauHinh.sc.nextLine();
                    
                    BaoCao bc = new BaoCaoKhoaLuan();
                    HoiDongBaoVe hd = new HoiDongBaoVe();
                    
                    for (var x: qlbc.getDSTheoLoai("com.thanhttt.baitaplon.BaoCaoKhoaLuan")) {
                        if (x.getMaBC().equals(mabc)) {
                            bc = x;
                            check = true;
                            break;
                        }
                    }
                    
                    for (HoiDongBaoVe y: qlhd.getDanhSachHoiDong())
                        if (y.getDanhSachKhoaLuan().contains(bc))
                            hd = y;
                    
                    for (var x1: qltvhd.getDSTheoHoiDong(hd.getMaHD())) {
                        double diemKL;          
                        System.out.printf("Nhap diem cua %s - %s %s %s %s: "
                                , x1.getNhiemVu().getTen(), x1.getThanhVien().getHocHam().getTenVietTat(), x1.getThanhVien().getHocVi().getTenVietTat()
                                , x1.getThanhVien().getHoGV(), x1.getThanhVien().getTenGV());
                        diemKL = Double.parseDouble(CauHinh.sc.nextLine());
                        
                        qld.them(new DiemCuaTVHD(x1, hd, bc, diemKL));
                    }
                    
                    bc.setDiemBC(qld.diemBaoCao(qld, bc));
                    
                    if (!check)
                        System.out.println("Khong tim thay bao cao!");
                    break;


                case 11:
                    chon1 = 1;
                    do {
                        System.out.print("1. Sap xep tang dan theo ten bao cao\n"
                                + "2. Sap xep giam dan theo ten bao cao\n"
                                + "3. Sap xep theo ngay bao cao cu nhat\n"
                                + "4. Sap xep theo ngay bao cao moi nhat\n"
                                + "5. Thoat\n");

                        System.out.print("Ban chon: ");
                        chon1 = Integer.parseInt(CauHinh.sc.nextLine());

                        while (chon1 < 1 || chon1 > 5) {
                            System.out.print("Khong hop le! Nhap lai: ");
                            chon1 = CauHinh.sc.nextInt();
                        }

                        switch(chon1) {
                            case 1:
                                qlbc.sapXep(1);
                                break;
                            case 2:
                                qlbc.sapXep(2);
                                break;
                            case 3:
                                qlbc.sapXep(3);
                                break;
                            case 4:
                                qlbc.sapXep(4);
                                break;
                            default:
                                break;
                        }
                    } while (chon1 < 5);
                    break;
                case 12:
                    String matv;
                    
                    System.out.print("Nhap ngay lam viec cua hoi dong: ");
                    HoiDongBaoVe h = new HoiDongBaoVe(CauHinh.f.parse(CauHinh.sc.nextLine()));
                    qlhd.them(h);
                    
                    while (true){
                        System.out.print("Nhap ma bao cao khoa luan can bao ve (Nhap 0 de thoat): ");
                        String ma = CauHinh.sc.nextLine();
                        if (ma.equals("0"))
                            break;
                        for (var x: qlbc.getDSTheoLoai("com.thanhttt.baitaplon.BaoCaoKhoaLuan"))
                            if (x.getMaBC().equals(ma)){
                                h.getDanhSachKhoaLuan().add((BaoCaoKhoaLuan) x);
                                break;
                            }
                    }
                    
                    System.out.print("Nhap so luong thanh vien (3 den 5 thanh vien): ");
                    int n = Integer.parseInt(CauHinh.sc.nextLine());
                    while(n < 3 || n > 5){
                        System.out.print("So thanh vien khong hop le. Nhap lai:");
                        n = Integer.parseInt(CauHinh.sc.nextLine());
                    }
                    
                    boolean checkCT = false;
                    boolean checkTK = false;
                    boolean checkPB = false;

                    do{
                        System.out.print("Nhap ma thanh vien: ");
                        matv = CauHinh.sc.nextLine();
                        for (var x: qlgv.getDanhSachGV())
                            if (x.getMaGV().equals(matv)){
                                System.out.print("Nhap chuc vu: ");
                                ThanhVienHoiDong tv = new ThanhVienHoiDong(x, h, CauHinh.sc.nextLine());
                                qltvhd.them(tv);
                                
                                if (tv.getNhiemVu().getTen().equals(VaiTroHoiDong.CHU_TICH.getTen()))
                                    checkCT = true;
                                else if (tv.getNhiemVu().getTen().equals(VaiTroHoiDong.THU_KY.getTen()))
                                    checkTK = true;
                                else if (tv.getNhiemVu().getTen().equals(VaiTroHoiDong.PHAN_BIEN.getTen()))
                                    checkPB = true;
                                break;
                            }
                        n--; 
                        if ((checkCT == false || checkTK == false || checkPB == false) && n == 0){
                            qltvhd.getDanhSachThanhVienHoiDong().removeAll(qltvhd.getDSTheoHoiDong(h.getMaHD()));
                            qlhd.getDanhSachHoiDong().removeIf(t -> t.getMaHD().equals(h.getMaHD()));
                            System.out.println("Khong the thanh lap hoi dong");
                            break;
                        }
                    } while( n > 0);
                    break;
                case 13:
                    check = false;
                    String maHD;
                    System.out.print("Nhap ma hoi dong: ");
                    maHD = CauHinh.sc.nextLine();
                    
                    for (var x: qlhd.getDanhSachHoiDong()) {
                        if (x.getMaHD().equals(maHD)) {
                            x.hienThi();
                            check = true;
                            break;
                        }
                    }
                    
                    if (!check)
                        System.out.println("Khong tim thay hoi dong!");
                    break;
                case 14:
                    check = false;
                    String tenBC;
                    System.out.print("Nhap ten bao cao: ");
                    tenBC = CauHinh.sc.nextLine();
                    
//                    for (var x: qlbc.getDanhSachBaoCao()) {
//                        if (x.getTenBC().equals(tenBC)) {
//                            for (var y: qlbc.timKiem(tenBC)) {
//                                y.hienThi();
//                            }
//                            check = true;
//                            break;
//                        }
//                    }
                    
                    for (var y: qlbc.timKiem(tenBC)) {
                                System.out.println("--------------------");
                                y.hienThi();
                                check = true;
                            }
                    
                    if (!check)
                        System.out.println("Khong tim thay bao cao!");
                    break;
                case 15:
                    String ngayBC;
                    System.out.print("Nhap ngay bao cao: ");
                    ngayBC = CauHinh.sc.nextLine();
                    Date d = CauHinh.f.parse(ngayBC);
                    
                    for (var y: qlbc.timKiem(d)) {
                        System.out.println("--------------------");
                        y.hienThi();
                    }
                    break;
                case 16:
                    chon1 = 1;
                    do {
                        check = false;
                        System.out.print("1. Tim kiem theo ngay cu the\n"
                                + "2. Tìm kiem theo khoang thoi gian\n"
                                + "3. Thoat\n");
                        
                        System.out.print("Chon: ");
                        chon1 = Integer.parseInt(CauHinh.sc.nextLine());

                        
                        while (chon1 < 1 || chon1 > 3) {
                            System.out.print("Khong hop le! Nhap lai: ");
                            chon1 = CauHinh.sc.nextInt();
                        }
                        
                        switch(chon1) {
                            case 1:
                                System.out.print("Tư ngay: ");
                                Date ngay1 = CauHinh.f.parse(CauHinh.sc.nextLine());
                                
                                for (var y: qlhd.timTheoNgayBaoVe(ngay1)) {
                                    System.out.println("--------------------");
                                    y.hienThi();
                                }
                                break;
                            case 2:
                                System.out.print("Tu ngay: ");
                                Date ngay2 = CauHinh.f.parse(CauHinh.sc.nextLine());
                                System.out.print("Den ngay: ");
                                Date ngay3 = CauHinh.f.parse(CauHinh.sc.nextLine());
                                
                                for (var y: qlhd.timTheoNgayBaoVe(ngay2, ngay3)) {
                                    System.out.println("--------------------");
                                    y.hienThi();
                                }
                                break;
                        }
                    } while (chon < 3);
                    break;
                default:
                    System.out.println("Ket thuc!");
                    break;
            }
        } while(chon < CauHinh.MAX_CHOICE);
    }
}
