package EX3;

import java.util.Scanner;
public class EX3 {
	public static void main(String[] args) {
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=myScanner.nextInt();
		
		if(age>=18) 
			System.out.println("Adult");
		
		else
			System.out.println("Child");
	}

}