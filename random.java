package practice;

import java.util.Random;

public class random {
	public static void main(String[] args) {
		
		Random r=new Random();
		int x=r.nextInt(3);
		System.out.println("I'm caled by Random class "+x);
		int max=3 ,min=0;
		int c=(int)(Math.random()*(max-min+1)+min);
		System.out.println("I'm called by Math.Random mode by providing range max to min "+c);
		System.out.println("I'm called by normal Math.Random mode "+ Math.random());
	}
}
