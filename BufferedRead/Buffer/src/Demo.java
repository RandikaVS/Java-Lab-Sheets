import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class Demo {
	
	public static void main(String args[])throws Exception {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		Scanner sc=new Scanner(System.in);
		
		String name;
		int age;
		int year;
		float gpa;
		
		System.out.println("Enter you name here : ");
		name=br.readLine();
		
		System.out.println("Enter you age : ");
		age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Year : ");
		year=sc.nextInt();
		
		System.out.println("Enter GPA : ");
		gpa=Float.parseFloat(br.readLine());
		
		System.out.println("Name : "+name+"\n"+"Age : "+age+"\n"+"Year : "+year+"\n"+"GPA : "+gpa);
		
	}
	

}
