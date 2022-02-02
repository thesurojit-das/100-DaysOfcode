import java.util.Scanner;
public class Prime_no {
public static void main(String[] args) {
	System.out.print("Enter the number\n");
	Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
	if(n%1==0 && n%n==0 && n%2!=0) {
		System.out.print(+n+" Its a prime nunmber");
	}
	else {
		System.out.print(+n+" Its not a prime number");
	}
}
}
