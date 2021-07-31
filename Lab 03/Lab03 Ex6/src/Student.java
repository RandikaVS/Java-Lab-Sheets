
public class Student extends Person {
	private String stuId;

	public Student(String sId) {
        stuId = sId;
    }
	public void showDetails() {
        System.out.println("Name is : " + name + "\n" + "Address is : " + address + "\n"+"Student Id Is :"+stuId);
    }
	
}
