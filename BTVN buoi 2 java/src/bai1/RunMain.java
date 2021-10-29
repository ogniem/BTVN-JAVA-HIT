package bai1;

import java.util.Scanner;


public class RunMain {

	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap lan luot 3 so nguyen: ");
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    System.out.println("so lon nhat: " + Math.max(a, Math.max(b,c)));
	   

}
	}
