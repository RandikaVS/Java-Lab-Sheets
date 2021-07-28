
package tutorial.w2;

/**
 *
 * @author sahan
 */
import java.util.Scanner;
public class TutorialW2_Ex1 {
    
    public TutorialW2_Ex1(){
        double m1=0,m2=0,m3=0;
    }
    public static void calcAvg(){
        Scanner sc=new Scanner(System.in);
        
        double m1,m2,m3,avg;
        int ID;
        String name;
        
        System.out.print("Enter you Name : ");
        name=sc.nextLine();
        System.out.print("Enter you ID : ");
        ID=sc.nextInt();
        System.out.print("Enter Marks of Subject 1 : ");
        m1=sc.nextDouble();
        System.out.print("Enter Marks of Subject 2 : ");
        m2=sc.nextDouble();
        System.out.print("Enter Marks of Subject 3 : ");
        m3=sc.nextDouble();
        
        avg=(m1+m2+m3)/3;
        display(ID,name,avg);
    }
    public static void display(int id,String n,double avg){
        
        System.out.println("Student ID : "+id);
        System.out.println("Student Name : "+n);
        System.out.println("Student Avarage : "+avg);
    }
    public static void main(String[] args) {
        
        TutorialW2_Ex1 obj=new TutorialW2_Ex1();
        calcAvg();
    }
    
}
