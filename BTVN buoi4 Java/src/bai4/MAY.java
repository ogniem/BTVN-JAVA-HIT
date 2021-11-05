package bai4;

import java.util.Scanner;

public class MAY {
    private String Mamay, Kieumay, Tinhtrang;
    Scanner sc= new Scanner(System.in);
    public MAY(){
    }
    public MAY(String mamay, String kieumay, String tinhtrang){
        Mamay= mamay;
        Kieumay= kieumay;
        Tinhtrang= tinhtrang;
    }
    public void NHAP(){
        System.out.println("Nhập mã máy: ");
        Mamay= sc.nextLine();
        System.out.println("Nhập kiểu máy: ");
        Kieumay= sc.nextLine();
        System.out.println("Nhập tình trạng máy: ");
        Tinhtrang= sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Mã máy: " + Mamay+ " Kiểu máy: "+ Kieumay+ " Tình trạng: "+Tinhtrang);
    }
}
