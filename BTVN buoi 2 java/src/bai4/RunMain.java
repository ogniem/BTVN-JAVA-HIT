package bai4;

import java.util.Locale;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap chuoi: ");
	        String s = sc.nextLine();
	        s = s.trim();
	        
	        s = s.replaceAll("\\s{2,}", " ");
	        
	        s = s.replaceAll("[0-9]", "");
	        
	        String[] str = s.split(" ");
	        s = "";
	        for (int i=0; i< str.length; i++){
	            s += String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1);
	            if (i < str.length - 1)
	                s += " ";
	        }
	        System.out.println("Chuoi sau khi chuan hoa: " + s);
	}

}
