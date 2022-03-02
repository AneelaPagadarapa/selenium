package coreJava;

import java.util.Scanner;


public class ScannerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a ;
		int b ;
		//user will provide the data(input) at runtime
		//user will enter the input in console at runtime
		//system will read the given inputs based on the Scanner class reference from the console
		//assign it to the variables
		
		a = s.nextInt();
		b = s.nextInt();
		System.out.println(a + b);
		
		
		
	}
	

}
