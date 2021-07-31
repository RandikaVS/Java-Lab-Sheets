
public class Test {
	
	public static void main(String args[])throws Exception{
        Student s1=new Student();
        s1.setName("Sahan");
        s1.setDit("DIT/11/C1/0010");
        s1.setAddress("Homagama");
        
        System.out.println("Student Name is : "+s1.getName());
        System.out.println("Student DitNumber is : "+s1.getDit());
        System.out.println("Student Address is : "+s1.getAddress());
        System.out.println("\n"+s1.getDetails());
    }
}
