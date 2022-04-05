import java.util.Scanner;
import java.lang.*;
public class StringOperation {
	public static void main(String[] args) {
		System.out.printf("Enter the string");
		Scanner scanner=new Scanner(System.in);
		String string =scanner.nextLine();
		int choice=0,pos,i=1;
		while(i!=0) {
		System.out.println("Enter you choice");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("String Upper Case = "+string.toUpperCase());
			System.out.println("String lower Case= "+string.toLowerCase());
			break;
		case 2:
			StringBuffer stringBuffer=new StringBuffer(string);
			System.out.println("Reverse String is "+stringBuffer.reverse());
			break;
		case 3:
			System.out.println("Enter the new String");
			Scanner scanner1=new Scanner(System.in);
			String String1=scanner1.nextLine();
			System.out.println(string.compareTo(String1));
			break;
		case 4:
			System.out.println("Position");
			Scanner scanner2=new Scanner(System.in);
			pos=scanner2.nextInt();
			System.out.println("Enter the new String");
			Scanner scanner3=new Scanner(System.in);
			String string2 =scanner3.nextLine();
			StringBuffer reString=new StringBuffer(string);
			reString.insert(pos+1,string2);
			System.out.println("New String is "+reString.toString());
			break;
		case 5:
			System.out.println("lenght" +string.length());
			break;
		case 6:
			System.out.println("New String");
			String1="Das";
//			String String1=new scanner.nextLine();
			System.out.println("Concartenation of string "+ string.concat(String1));
			break;
		default:
			System.out.print("Error");
		}
		System.out.println("Cont");
		i=scanner.nextInt();
				
		}
	}
}
