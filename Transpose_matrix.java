package practice;

import java.util.Scanner;

public class Transpose_matrix {
public static void main(String[] args) {
		System.out.print("Enter the no");
		Scanner scanner =new Scanner(System.in) ;
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		int array[][]=new int [n][m];
		System.out.print("Enter the Data of matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				Scanner scanner1 =new Scanner(System.in) ;
				array[i][j]=scanner1.nextInt();
			}
		}
		System.out.println("Original Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(" " +array[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(" " +array[j][i]);
				
			}
			System.out.println();
		}
		
		
	}
}
