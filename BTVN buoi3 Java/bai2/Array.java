package bai2;

import java.util.Scanner;
public class Array {

	private int []a;
	private int n;
	
	public static Scanner sc = new Scanner(System.in);
	
	public Array() {
		a = null;
		n =0;
	}
	public Array(int[] a, int n)
	{
		this.n = n;
		for(int i =0; i<n; i++)
		{
			this.a[i] = a[i];
		}
	}
	public void setn(int n)
	{
		this.n = n;
	}
	public void seta(int[] a)
	{
		this.a = a;
	}
	public int getn()
	{
		return n;
	}
	public int[] geta()
	{
		return a;
	}
	public void InputData()
	{
	     System.out.println("nhap n: ");
	     n = sc.nextInt();
	     a = new int[n];
	     System.out.println("nhap mang a gom n phan tu: ");
	     for(int i=0; i<n; i++)
	     {
	    	 System.out.println("a["+ i +"]= ");
	    	 a[i] = sc.nextInt();
	     }
	}
	public void Show()
	{
		for(int i=0; i<n; i++)
		{
		     System.out.print(a[i] +" ");	
		}
		System.out.println("");
	}
	public int Sum()
	{
		int sum =0;
		for(int i =0; i<n; i++)
		{
			sum += a[i];
		}
		return sum;
		
	}
	public void Filter(boolean flag)
	{
		if(flag = true)
		{
			System.out.println("So chan trong mang la: ");
			for(int i =0; i< n; i++)
			{
				if(a[i] % 2 ==0)
				{
					System.out.print(a[i] +" ");
				}
			}
		}
		else
		{
			System.out.println("So le trong mang la: ");
			for(int i =0; i< n; i++)
			{
				if(a[i] % 2 != 0)
				{
					System.out.print(a[i] + " ");
				}
			}
		}
	}

}
