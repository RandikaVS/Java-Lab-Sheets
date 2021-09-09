/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_24;
import java.util.HashMap;
public class Enroll {
    
    HashMap<String,String> enroll=new HashMap<String,String>();
    
    public void enrollStudent(String id,String spec){
        enroll.put(id,spec);
    }
    public void dispalyEnrolledStudents(){
        for(String id:enroll.keySet()){
            System.out.println(id+" : "+enroll.get(id));
        }
    }
}
