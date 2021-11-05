package bai1;
import java.util.Scanner;
public class Sach {
   private String Masach, Tensach, Nxb;
   private  int Sotrang, Giatien;
   public Sach(){

   }
   public Sach(String masach, String tensach, String nxb, int sotrang, int giatien){
       Masach= masach;
       Tensach= tensach;
       Nxb= nxb;
       Sotrang= sotrang;
       Giatien= giatien;

   }
    public void NHAP(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập Mã sách: ");
        Masach= sc.nextLine();
        System.out.println("Nhập Tên sách: ");
        Tensach= sc.nextLine();
        System.out.println("Nhập Nhà xuất bản: ");
        Nxb = sc.nextLine();
        System.out.println("Nhập Số trang: ");
        Sotrang= sc.nextInt();
        System.out.println("Nhập Giá tiền: ");
        Giatien= sc.nextInt();
    }
    public void XUAT(){
        System.out.println("Mã sách: " + Masach +" Tên sách: " + Tensach + " Nhà xuất bản: " + Nxb + " Số trang: " + Sotrang + " Giá tiền: "+Giatien);

    }
}
