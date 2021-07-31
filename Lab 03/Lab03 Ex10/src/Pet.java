
public class Pet {
	
	private String name;
	private String owner;
	private int age;
	
	public Pet(String n, String o, int a) {
		
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	public Pet(String n,String o) {
		this.name=n;
		this.age=Integer.parseInt(o);
	}
	
	public void showDetails(){
		
		System.out.print("I am a pet. My name is "+this.name+". My owner is "+this.owner+" My age is "+this.age+"\n");
	}
}
