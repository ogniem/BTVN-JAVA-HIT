package bai1;

public class RunMain {

	public static void main(String[] args) {
		int m = 11;
		int n = 9;
		for(int i =1; i<= m;i++)
		{
			for(int j = 1; j<=n; j++)
			{
				if(i == 1 || i == m)
					System.out.print("*");
				else if (j==1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
