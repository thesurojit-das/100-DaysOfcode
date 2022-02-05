package practice;

import java.util.Scanner;

public class sort {

public static void main(String[] args) {
	System.out.println("enter the size");
	Scanner scanner=new Scanner(System.in);
	int size=scanner.nextInt();
	int array[]=new int[size];
	for(int i=0;i<size;i++)
	{
		Scanner sc=new Scanner(System.in);
		array[i]=sc.nextInt();
	}
	int min,j;
	for(int i=0;i<size-1;i++)
	{
		for(j=0;j<size-i-1;j++) {
			if(array[j]>array[j+1])
			{
			int temp = array[j];
			array[j]=array[j+1];
			array[j+1]=temp;
			}
		}
		}
	for(int i=0;i<size;i++)
	{
		System.out.print(" " +array[i]);
	}
}


}
