
public class Main {
	
	public static void main(String args[]) {
		Book b1=new Book();
		Student s1=new Student();
		
		iDisplay d1;
		iInput i1;
		d1=new Book();
		d1.printDetails();
		i1=new Student();
		i1.input();
		
		b1.input();
		b1.print();
		b1.printDetails();
		
		s1.input();
		s1.print();
		s1.printDetails();
		
	}

}
