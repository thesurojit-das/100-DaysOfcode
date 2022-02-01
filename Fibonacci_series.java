import java.util.Scanner;

public class Fibonacci_series {
public static void main(String[] args) {
	System.out.print("enter the number \n ");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int a=0,b=1,c=0;
	System.out.print("fibonacci Serires of " + x +" is " + a + " " +b);
	for(int i=0;i<x;i++)
	{
		c=a+b;
		System.out.print(" " +c);
		a=b;
		b=c;
	}
}
}
