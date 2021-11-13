package bai1;

import java.util.Scanner;

public class SanPham {
    protected String MaSp, TenSp, TenHangSx, NgayNhap;
    Scanner sc= new Scanner(System.in);
    public SanPham(){
    }
    public SanPham(String MaSp, String TenSp, String TenHangSx, String NgayNhap){
        this.MaSp= MaSp;
        this.TenSp= TenSp;
        this.TenHangSx= TenHangSx;
        this.NgayNhap= NgayNhap;

    }
    public void NHAP(){
        System.out.println("Nhập mã sp: ");
        MaSp= sc.nextLine();
        System.out.println("Nhập tên sp: ");
        TenSp=sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        TenHangSx=sc.nextLine();
        System.out.println("Nhập ngày nhập: ");
        NgayNhap= sc.nextLine();

    }
    public void XUAT() {
        System.out.println("Mã sp: " + MaSp + " Tên sp: " + TenSp + " Tên hãng sx: " + TenHangSx + " Ngày nhập: " + NgayNhap);
        double min = 0;

    }
    public String getTenHangSx(){
        return TenHangSx;
    }
}
