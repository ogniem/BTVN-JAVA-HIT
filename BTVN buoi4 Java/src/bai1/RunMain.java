package bai1;
 import java.util.Scanner;
public class RunMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhập số cuốn sách: ");
            n = scan.nextInt();
        }while (n<=0);
        Sach [] sach= new Sach[n];
        for(int i =0; i<n; i++)
        {
            sach[i] = new Sach();
            System.out.println("Nhập thông tin của cuốn sách thứ " + (i+1));
            sach[i].NHAP();
        }
        System.out.println("Danh sách: ");
        for(int i =0; i<n; i++){
            System.out.print("Cuốn sách thứ " +(i+1) +": ");
            sach[i].XUAT();
        }
    }
}
