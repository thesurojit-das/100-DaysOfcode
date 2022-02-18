package practice;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		System.out.print("enter the size");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int array[]=new int [size];
		for(int i=0;i<size;i++)
		{
			Scanner scanner2=new Scanner(System.in);
			array[i]=scanner.nextInt();
		}
		System.out.println("\nEven");
		for(int i=0;i<size;i++)
		{
			if(array[i]%2==0)
			System.out.print(" " +array[i]);
		}
		System.out.println("\nOdd");
		for(int i=0;i<size;i++)
		{
			if(array[i]%2!=0)
			System.out.print(" "+array[i]);
		}
	}
}
