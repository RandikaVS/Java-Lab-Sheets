
package assignment_24;
public class Assignment_24 {

    public static void main(String[] args) {
        
        WeekEnd student1=new WeekEnd();
        student1.addDetails("Jane","Malabe","F",1990,"DS","QA");
        student1.Id=student1.genarateId();
        student1.addMarks(56, 34, 12, 46, 78);
        student1.ShowDetails();
        System.out.println("Student ID : "+student1.Id);
        System.out.println();
        
        Week student2=new Week();
        student2.addDetails("Jim","Kaluthara","M",1991,"SE","Tuesday");
        student2.Id=student2.genarateId();
        student2.addMarks(78,89,45,87,90);
        student2.ShowDetails();
        System.out.println("Student ID : "+student2.Id);
        
        Enroll sem1=new Enroll();
        sem1.enrollStudent(student1.Id,"IT");
        sem1.enrollStudent(student2.Id,"SE");
        System.out.println("\n"+"Enrolled Student Details : ");
        sem1.dispalyEnrolledStudents();
        
        Specialization spe=new Specialization();
        spe.addSpecialization("SE",2.75);
        spe.addSpecialization("DS",3.5);
        spe.ShowSpecialization();
    }
    
    
}
