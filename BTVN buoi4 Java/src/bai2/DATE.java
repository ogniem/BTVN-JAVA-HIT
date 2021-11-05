package bai2;

import java.util.Scanner;

public class DATE {
    private int D,M,Y;
    Scanner sc= new Scanner(System.in);
    public DATE(){
    }
    public DATE(int d, int m, int y) {
        D = d;
        M = m;
        Y = y;
    }
    public void NHAP(){
        do{
            System.out.print("Nhập ngày: ");
            D= sc.nextInt();
            System.out.print("Nhập tháng: ");
            M = sc.nextInt();
            System.out.println("Nhập năm: ");
            Y = sc.nextInt();
        }while(D<1 || D >31 || M <1 || M >12 || Y<= 0);

    }
    public void XUAT(){
        System.out.println(D +"/ " + M +"/ "+ Y);
    }
}
