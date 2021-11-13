package bai3;
import java.util.Scanner;
public class SINHVIEN extends NGUOI {
    private String MaSV, Nganh;
    private int KhoaHoc;
    @Override
    public  void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã SV: ");
        setMaSV(sc.nextLine());
        System.out.println("Nhập ngành học: ");
        setNganh(sc.nextLine());
        System.out.println("Nhập khóa học: ");
        setKhoaHoc(sc.nextInt());
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf("Mã sv: "+MaSV+" Ngành: "+Nganh+" Khóa học: "+KhoaHoc);
    }
    public SINHVIEN(){}
    public String getMaSV(){
        return MaSV;
    }

    public String getNganh() {
        return Nganh;
    }

    public int getKhoaHoc() {
        return KhoaHoc;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setNganh(String Nganh) {
        this.Nganh = Nganh;
    }

    public void setKhoaHoc(int KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }

}
