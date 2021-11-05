package bai2;


import java.util.Scanner;
import java.util.Date;
public class NHANSU {
    private String Manhansu;
    private String Hoten;
    private DATE  DATENS = new DATE();
    public NHANSU(){
    }
    public NHANSU(String manhansu, String hoten, DATE NS) {
        Manhansu = manhansu;
        Hoten = hoten;
        this.DATENS = NS;
    }
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân sự: ");
        Manhansu = sc.nextLine();
        System.out.println("Nhập họ tên: ");
        Hoten= sc.nextLine();
        System.out.println("Nhập ngày tháng năm: ");
        DATENS.NHAP();

    }
    public void XUAT(){
        System.out.println("Mã nhân sự: " + Manhansu);
        System.out.println("Họ tên: "+ Hoten);
        System.out.print("DATENS: ");
        DATENS.XUAT();
    }

}
