package com.thanhttt.baitaplon;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CauHinh {
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static final Scanner sc = new Scanner(System.in);
    public static final int MAX_CHOICE = 17;
    
    public void inFile(QuanLyGiangVien qlgv, String s) throws FileNotFoundException, ParseException{
            File inGV = new File(s);
            Scanner scf = new Scanner(inGV);
            while (scf.hasNextLine()){
                String line = scf.nextLine();
                String[] values = line.split("#");
                GiangVien gv = new GiangVien(values[0], values[1], values[2], values[3], values[4], values[5]);
                qlgv.them(gv);
            }
        }
    
    public void inFile(QuanLySinhVien qlsv, String s) throws FileNotFoundException, ParseException{
            File inGV = new File(s);
            Scanner scf = new Scanner(inGV);
            while (scf.hasNextLine()){
                String line = scf.nextLine();
                String[] values = line.split("#");
                SinhVien sv = new SinhVien(values[0], values[1], Integer.parseInt(values[4]), values[2], values[3], values[5]);
                qlsv.them(sv);
            }
        }
}
