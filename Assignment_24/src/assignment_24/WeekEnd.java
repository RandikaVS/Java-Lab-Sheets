
package assignment_24;

public class WeekEnd extends Student {
    private String JobTitle;
    
    public WeekEnd(){}
    
    public void addDetails(String n,String addr,String sex,int year,String spec,String jTitle){
         
         super.Name=n;
         super.Address=addr;
         super.Sex=sex;
         super.bYear=year;
         super.specialization=spec;
         this.JobTitle=jTitle;
         
     }
     public void addMarks(int m1,int m2,int m3,int m4,int m5){
        super.Marks[0]=m1;
        super.Marks[1]=m2;
        super.Marks[2]=m3;
        super.Marks[3]=m4;
        super.Marks[4]=m5;
    }
     
    public void ShowDetails(){
        System.out.println("Student Name : "+super.Name);
        System.out.println("Student Address : "+super.Address);
        System.out.println("Student Sex : "+super.Sex);
        System.out.println("Student Birth Year : "+super.bYear);
        System.out.println("Student Specialization : "+super.specialization);
        System.out.println("Student Job Title : "+this.JobTitle);
        
    }
    
}
