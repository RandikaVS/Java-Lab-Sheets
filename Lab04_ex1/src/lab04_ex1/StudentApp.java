
package lab04_ex1;

public class StudentApp {

 
    public static void main(String[] args) {
        
            Student arr[]=new Student[5];
            arr[0]=new Student("Sahan","IT","011");
            arr[1]=new Student("Amda","BS","012");
            arr[2]=new Student("Mohan","ENG","013");
            arr[3]=new Student("Isiwara","IT","014");
            arr[4]=new Student("Shehan","Sex","015");
            
            for(int i=0;i<5;i++){
            arr[i].genarateID();
            }
           for(int i=0;i<5;i++){
                arr[i].print();
            }
        
    }
    
}
