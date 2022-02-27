package practice;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the Array Number");
		for(int i=0;i<size;i++)
		{
			Scanner scanner1=new Scanner(System.in);
			array[i]=scanner.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=array[i];
		}
		System.out.println("Sum of Array "+sum);
	}

}
