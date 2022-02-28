package practice;

import java.util.Scanner;

public class Linear_search {

	 static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }   
	public static void main(String[] args) {
		System.out.println("Enter the Size");
		Scanner scanner =new Scanner(System.in) ;
		int size=scanner.nextInt();
		int array[]=new int [size];
		System.out.println("Enter the data");
		for(int i=0;i<size;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter the Key");
		int key=scanner.nextInt();
		 System.out.println(key+" is found at index: "+linearSearch(array, key));  
	}
}
