package bai3;
import java.util.Scanner;
public class RunMain {

	
		// TODO Auto-generated method stub
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int check = 0,sum = 0, dem = 0;
		
		
		for(int i = 0; i< s.length(); i++)
		{
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
			{
				check ++;
				sum += s.charAt(i) - 48;
				dem ++;
			}
		}
		if(check == 0)
		     System.out.println("false");
		
		else
		{
			System.out.println("true");
			System.out.println("average= " +(float)sum/dem);
		}
		
	}
}
