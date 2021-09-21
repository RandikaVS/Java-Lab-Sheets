
package lab04_ex1;
import java.util.Random;

public class Student {
    private int stuID;
    private String name;
    private String deg;
    private String mobile;
    private static int max=100;
    
    Student(String n,String d,String m){
        this.name=n;
        this.deg=d;
        this.mobile=m;
    }
    void genarateID(){
        int i=0,randId;
            Random rand=new Random();
            randId=rand.nextInt(max);
            this.stuID=randId;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setDegree(String d){
        this.deg=d;
    }
    public void setMobile(String m){
        this.mobile=m;
    }
    public String getName(){
        return this.name;
    }
    public String getDegree(){
        return this.deg;
    }
    public String getMobile(){
        return this.mobile;
    }
    public void print(){
        System.out.println("Student ID : \n"+this.stuID);
        System.out.println("Student Name : \n"+this.name);
        System.out.println("Student Degree : \n"+this.deg);
        System.out.println("Student Mobile : \n"+this.mobile);
    }
    public static int getNextStudentId(){
       return max;
    }
    
    
}
