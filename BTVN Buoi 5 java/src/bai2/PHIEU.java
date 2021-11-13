package bai2;
import java.util.ArrayList;
import java.util.Scanner;

public class PHIEU {
    private String MaPhieu, TenPhieu;
    private DateTime a = new DateTime();
    ArrayList<SANPHAM> x= new ArrayList<>();
    private int n;
    Scanner sc= new Scanner(System.in);
    public PHIEU(){
    }
//    public PHIEU(String MaPhieu, String TenPhieu, DateTime a, SANPHAM[] x, int n){
//        this.MaPhieu= MaPhieu;
//        this.TenPhieu=TenPhieu;
//        this.a=a;
//        this.x= x;
//        this.n=n;
//    }
    public void InputPhieu(){
        System.out.println("Nhập mã phiếu: ");
        MaPhieu= sc.nextLine();
        System.out.println("Nhập tên phiếu: ");
        TenPhieu=sc.nextLine();
        System.out.println("Nhập ngày tháng năm: ");
        a.InputDate();
        System.out.println("Nhập số sản phẩm: ");
        n=sc.nextInt();
        System.out.println("Nhập thông tin các sản phẩm: ");

        for(int i =0; i<n; i++){
            System.out.println(i+1);
            SANPHAM tmp= new SANPHAM();
            tmp.InputSP();
            x.add(tmp);
        }

    }
    public void OutputPhieu(){
        System.out.println("Mã phiếu: "+MaPhieu+" Tên phiếu: "+TenPhieu);
        double thanhtien =0;
        for(int i=0; i<n; i++){
            System.out.println("Thông tin sản phẩm: "+(i+1));
            x.get(i).OutputSP();
            thanhtien= x.get(i).getDonGia()*x.get(i).getSoLuong();
            System.out.println("Thành tiền: "+ thanhtien);

        }
    }


}
