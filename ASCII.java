package practice;

import java.util.Scanner;

public class ASCII {
public static void main(String[] args) {
	System.out.println("1.char to int \n2.int to char\n");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	Scanner sc1=new Scanner(System.in);
	if(choice==1) {
		System.out.println("enter the character");
		char c=sc1.next().charAt(0);
		int n=c;
		System.out.println("the character you have enter is " +c+ " chacater of that is " +n);
	}
	else {
		System.out.println("enter the number");
		int n=sc1.nextInt();
		char c=(char)n;
		System.out.println("the number  you have enter is " +n+ " chacater of that is " +c);
	}
}
}
