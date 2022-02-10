package practice;

import java.util.*;

public class diagonal_sum {
public static void main(String[] args) {
//	System.out.println("enter the size");
//	Scanner scanner=new Scanner(System.in);
//	int size=scanner.nextInt();
	int array[][]=new int[3][3];
	int i,j ,sum=0;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++) {
		Scanner sc=new Scanner(System.in);
		array[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++) {
			System.out.print(" " +array[i][j]);
		}
		System.out.println();
	}
	System.out.print(" left to right diagonal sum is ");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(i==j)
			{
				sum+=array[i][j];
			}
		}
	}
			System.out.println(" " +sum);
			sum=0;
			System.out.print(" left to right diagonal sum is ");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					
					if(i==j || i+j==3-i)
					{
						sum+=array[i][j];
					}
				}
			}
			System.out.println(" " +sum);
}
}
