package practice;

import java.util.Scanner;

public class SumofRowColumn {

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
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(" " +array[i][j]);
			}
			System.out.println();
		}
		int row,col;
		for(int i=0;i<n;i++)
		{
			row=0;
			for(int j=0;j<m;j++)
			{
				row+=array[i][j];
			}
			System.out.println("Sum of "+i+" Row "+row);
		}
		for(int i=0;i<n;i++)
		{
			col=0;
			for(int j=0;j<m;j++)
			{
				col+=array[j][i];
			}
			System.out.println("Sum of "+i+" Coloumn "+col);
		}
	}
}
