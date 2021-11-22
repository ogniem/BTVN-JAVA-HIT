package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String chuoi;
        int dem=0;
        int sum =0;
        chuoi = sc.nextLine();
        for(int i=0; i< chuoi.length();i++){

            if(Character.isDigit(chuoi.charAt(i))) {
                dem++;
                sum+= chuoi.charAt(i)-48;
            }
        }
        System.out.println("Có "+dem+" ký tự số");
        System.out.println(sum);
    }
}
