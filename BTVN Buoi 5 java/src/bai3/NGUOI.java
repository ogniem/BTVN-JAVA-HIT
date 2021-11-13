package bai3;

import java.util.Scanner;

public class NGUOI {
    protected String HoTen, NgaySinh, QueQuan;
    Scanner sc=new Scanner(System.in);
    public NGUOI(){}
    public NGUOI(String HoTen, String NgaySinh, String QueQuan){
        this.HoTen=HoTen;
        this.NgaySinh=NgaySinh;
        this.QueQuan=QueQuan;
    }
    public void Nhap(){
        System.out.println("Nhập họ tên: ");
        HoTen= sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        NgaySinh=sc.nextLine();
        System.out.println("Nhập quên quán: ");
        QueQuan=sc.nextLine();
    }
    public void Xuat(){
        System.out.println(" Họ tên: "+HoTen+" Ngày sinh: "+NgaySinh+" Quê quán: "+QueQuan);
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getQueQuan() {
        return QueQuan;
    }
}
