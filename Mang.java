package baiTap;

import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int index =0;
		int n;
		do {
			System.out.print("nhập vào số phấn tử của mảng:");
			n = scanner.nextInt();
			if(n <= 0)
			{
				System.out.println("nhập sai....."+"\nnhập lại..... ");	
			}
		}while(n <= 0);
		
		int[] a = new int[n];
		for( index = 0; index<n; index++)
		{
			System.out.print("a"+"["+(index+1)+"]=");
			a[index]=scanner.nextInt();
		}
		
		
//in ra		
		 index=0;
		System.out.print("các giá trị của mảng là :" );
		do {
			System.out.print(a[index]+" ");
			index++;
		}while(index<n);

		
//Max min
	
		int min = a[0];
		   for( index = 0; index<n; index++)
		   {
		        if(min > a[index])
		        {
		        	min = a[index];
		        }
		   }
		   System.out.println("\nmin=" +min);
		   
		   int max = a[0];
		   for( index = 0; index <n; index++)
		   {
		        if(max < a[index])
		        {
		        	max = a[index];
		        }
    
		   }
		   System.out.println("max=" + max);
		   
//so ngto
		  
		   int dem2=0;
			for( index=0; index < n; index++)
			{
				 int dem=0;
				for( int itemp = 1; itemp <= a[index]; itemp++)
				{
					if(a[index] % itemp == 0)
					{
						dem ++;
					}
				}
				if(dem == 2)
				{
					 System.out.print("số nguyên tố là: ");
					System.out.println( a[index] + " ");
					dem2++;
				}
				
			}	
			if(dem2 == 0) {
				 System.out.println("ko có số nguyên tố ");
			}
//sap xep
		System.out.print("sắp xếp tăng dần:");
		for( index=0; index < n; index++)
		{
			for( int index2=index+ 1 ; index2 < n; index2++)
			{
				if(a[index]>a[index2])
				{
						int tg = a[index];
						a[index] = a[index2];
						a[index2] = tg;
				}
			}
			System.out.print(a[index]+" ");	
		}		
	}
}
