
package assignment_24;

 import java.util.Random;
public class Student implements StudentInterface {

    protected String Id;
    protected String Name;
    protected String Address;
    protected String Sex;
    protected int bYear;
    protected String specialization;
    protected int Marks[]=new int[5];
    
    public Student(){}  
    
    @Override
    public String genarateId(){
        int i=0;
        do{
        Random rand=new Random();
        long randId=rand.nextInt(10000);
        try{
        if(randId>=1000){
            this.Id=this.specialization+randId;
            i=1;
        }
        else{
            i=0;
            throw new IDInvalidException("Invalid ID Generated!");
            
        }
        }catch(IDInvalidException e){
            System.out.println(e.getMessage());
        }
       }while(i!=1);
          return this.Id;
}
    
   
}
