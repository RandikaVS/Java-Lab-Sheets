import java.util.Scanner;
public class Book implements iDisplay,iInput {
	Scanner sc=new Scanner(System.in);
	int bId;
	String bTitle;
	String publisher;
	@Override
	public void input() {
		System.out.println("Enter book ID : ");
		this.bId=sc.nextInt();
		System.out.println("Enter book Title : ");
		this.bTitle=sc.next();
		System.out.println("Enter book publisher : ");
		this.publisher=sc.next();
		
	}
	@Override
	public void print() {
		System.out.println("Book Id : "+this.bId+"\n"+"Title : "+this.bTitle+"\n"+"Publisher : "+this.publisher);
	}
	@Override
	public void printDetails() {
		System.out.println("Book ID : "+bId);
		System.out.println("Book Title : "+bTitle);
		System.out.println("Book Publisher : "+publisher);
		
	}
	
}
