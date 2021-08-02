
public class Book implements Printable {
	int bId;
	String bName;
	String author;
	
	public Book(int bId,String bName,String author) {
		this.bId=bId;
		this.bName=bName;
		this.author=author;
	}
	@Override
	public void print() {
		System.out.println("Print type : "+type);
		System.out.println("Book ID : "+bId);
		System.out.println("Book Name : "+bName);
		System.out.println("Book Author : "+author+"\n");
	}
	

}
