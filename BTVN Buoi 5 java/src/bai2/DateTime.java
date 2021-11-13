package bai2;

import java.util.Scanner;

public class DateTime {
    private int Ngay, Thang, Nam;
    Scanner sc= new Scanner(System.in);
    public DateTime(){
    }
    public  DateTime(int Ngay, int Thang, int Nam){
        this.Ngay=Ngay;
        this.Thang=Thang;
        this.Nam=Nam;
    }
    public void InputDate(){
        do{
            System.out.print("Nhập ngày: ");
            Ngay= sc.nextInt();
            System.out.print("Nhập tháng: ");
            Thang = sc.nextInt();
            System.out.println("Nhập năm: ");
            Nam = sc.nextInt();
        }while(Ngay<1 || Ngay >31 || Thang <1 || Thang >12 || Nam<= 0);
    }
    public void OutputDate(){
        System.out.println(Ngay+"/ "+ Thang+"/ "+ Nam);
    }
}


