
package assignment_24;
import java.util.HashMap;
public class Specialization extends Student {
    HashMap<String,Double> Spec=new HashMap<String,Double>();
    
     public void addSpecialization(String spec,double g){
        
        Spec.put(spec,g);
    }
    public void ShowSpecialization(){
       for(String spec:Spec.keySet()){
        System.out.println("\n"+"Speecialization : "+spec+"\n"+"GPA : "+Spec.get(spec));
       }
    }
}
