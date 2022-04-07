package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i=0;
		FileInputStream fin = null;
		try {
			fin=new FileInputStream("C:\\Users\\KIIT\\Desktop\\kiit.txt");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not found");
			return;
		}
		do {
			i=fin.read();
			if(i!=-1) {
				System.out.print((char)i);
			}
		}while(i!=-1);
		fin.close();
	}

}
