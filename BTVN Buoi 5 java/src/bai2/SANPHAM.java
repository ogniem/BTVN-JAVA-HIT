package bai2;

import java.util.Scanner;

public class SANPHAM {
    private String MaSP, TenSP;
    private int SoLuong;
    private double DonGia;
    Scanner sc= new Scanner(System.in);
    public SANPHAM(){
    }
    public SANPHAM(String MaSP, String TenSP, int SoLuong, double DonGia){
        this.MaSP= MaSP;
        this.TenSP= TenSP;
        this.SoLuong= SoLuong;
        this.DonGia= DonGia;
    }
    public void InputSP(){
        System.out.println("Nhập mã sản phẩm: ");
        MaSP= sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        TenSP= sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        SoLuong= sc.nextInt();
        System.out.println("Nhập đơn giá: ");
        DonGia= sc.nextDouble();
    }
    public void OutputSP(){
        System.out.println("Mã sp: "+ MaSP+ " Tên SP: "+ TenSP+" Số lượng: "+SoLuong+ " Đơn giá: "+ DonGia);
    }
    public int getSoLuong(){
        return SoLuong;
    }
    public double getDonGia(){
        return DonGia;
    }
}
