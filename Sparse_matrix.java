package practice;

import java.util.Scanner;

public class Sparse_matrix {

	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner scanner =new Scanner(System.in) ;
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		int array[][]=new int [n][m];
		System.out.println("Enter the Data of matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				Scanner scanner1 =new Scanner(System.in) ;
				array[i][j]=scanner1.nextInt();
			}
		}
		int zero=0,non=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(array[i][j]==0)
					zero++;
				else 
					non++;
			}
		}
		System.out.println("Sparse Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(" " +array[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();
		
		if(zero>non)
		{
			System.out.print("Sparse Matrix");
		}
		else {
			System.out.print("NOT Sparse Matrix");
		}
	}

}
