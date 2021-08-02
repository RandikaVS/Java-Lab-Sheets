
public class Employee implements Printable {
	int id;
	String name;
	String address;
	public Employee(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	@Override
	public void print() {
		System.out.println("Print type : "+type);
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address+"\n");
	}

}
