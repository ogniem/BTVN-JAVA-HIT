package bai2;

import java.util.Scanner;
import java.lang.Math;

public class RunMain {
	static int n;
    static int[] arr;
    static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	
    	   System.out.println("\n================Menu===============");
    	   System.out.println("1.Nhập mảng");
           System.out.println("2.Xuất mảng");
           System.out.println("3.Thêm một phần tử vào vị trí k bất kì");
           System.out.println("4.Xóa một phần tử tại vị trí k bất kì");
           System.out.println("5.Hiển thị mảng đảo ngược");
           System.out.println("6.Hiện thị phần tử a[1] và chia hết cho các số a[1]");
           System.out.println("7.Xuất ra tổng các số nguyên tố trong mảng");
           System.out.println("8.Thoát");
           while(true) {
               System.out.print("\nNhập lựa chọn:  = ");
               int lc = sc.nextInt();
               if(lc == 1) {
                  nhap_mang();
               } else if(lc == 2) {
                   in_mang();
               } else if(lc == 3) {
            	  
                   chen();
               } else if(lc == 4) {
                   xoa();
               } else if(lc == 5) {
                   dao_nguoc();
               } else if(lc == 6) {
                   pt_arr1();
               } else if(lc == 7) {
                   nt();
               } else if(lc == 8) {
                   System.out.print("Bạn đã chọn thoát.");
                   break;
               }
           }
       
       
	}

	public static void nhap_mang()
	{
		System.out.println("nhap n: ");
		n = sc.nextInt();
		arr = new int [n+1000];
		System.out.println("Nhập mảng có " + n +" phần tử: ");
		for(int i =0; i<n ;i++)
	       {
	    	   System.out.print("a[" + i+ "] = ");
	    	   arr[i] = sc.nextInt();
	       }
	}
	
	public static void in_mang()
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void chen()
	{
        int k,x;
        do{
            System.out.print("Nhập vị trí cần chèn: ");
            k = sc.nextInt();
        }while(k<0 || k > n);
        System.out.print("Nhập số cần chèn: ");
        x = sc.nextInt();
        for(int i=n; i>=k; i--){
            arr[i] = arr[i-1];
        }
      
        arr[k-1] = x;
        n++;
          
	}
	public static void xoa()
	{
		int k;
		do {
		System.out.println("nhap vi tri muon xoa: ");
		 k = sc.nextInt();
	}while(k<0 || k >n);
		for(int i=k-1;i<n;i++){
            arr[i]=arr[i+1];
        }
		n--;	
    }
	public static void dao_nguoc() {
		 for(int i=n-1;i>=0;i--){
	            System.out.print(arr[i] + " ");
	        }
	           
	    }
	public static void pt_arr1()
	{
		System.out.println("arr[1]= " + arr[1]);
        System.out.println("Các số chia hết cho arr[1] trong mảng: ");
        for(int i=0;i<n;i++){
            if(arr[i] % arr[1] == 0)
                System.out.print(arr[i] + " ");
        }  
	}
	 public static boolean kt(int n) {
	        if(n<2) 
	            return false;
	        for(int i=2;i*i<=n;i++){
	            if(n%i==0)
	                return false;
	        }
	        return true;
	    }
	  public static void nt() {
	        int sum=0;
	        for(int i=0;i<n;i++){
	            if(kt(arr[i]) == true)
	                sum+=arr[i];
	        }
	        System.out.println("Tổng các số nguyên tố trong mảng là: "+sum);
	    }
	}
	

