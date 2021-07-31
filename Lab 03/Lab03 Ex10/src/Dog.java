
public class Dog extends Pet {
	
	private int noOfMasters;
	
	public Dog(String n, String o, int a, int m) {
		super(n,o,a);
		this.noOfMasters=m;
	}
	public Dog(String n,String o) {
		
		super(n,o);
	}
public void showDetails(){
		super.showDetails();
		System.out.println("I am a Dog. "+"I have "+this.noOfMasters+" masters at home."+"\n");
	}

}
