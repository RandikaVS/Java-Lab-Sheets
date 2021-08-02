import java.util.Scanner;
public class Student implements iDisplay,iInput {
	Scanner sc=new Scanner(System.in);
	int sId;
	String name;
	@Override
	public void input() {
		System.out.println("Enter Student ID : ");
		this.sId=sc.nextInt();
		System.out.println("Enter Student Name : ");
		this.name=sc.next();
	}
	@Override
	public void print() {
		System.out.println("Studen Id : "+this.sId+"\n"+"Name : "+this.name);
	}
	@Override
	public void printDetails() {
		System.out.println("Student Id : "+this.sId);
		System.out.println("Student Name : "+this.name);
		
	}

}
