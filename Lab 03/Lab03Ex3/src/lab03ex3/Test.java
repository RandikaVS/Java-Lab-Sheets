/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03ex3;

/**
 *
 * @author sahan
 */
public class Test {
    
    public static void main(String args[])throws Exception{
        Student s1=new Student();
        s1.setName("Sahan");
        s1.setDit("001");
        s1.setAddress("Homagama");
        
        System.out.println("Student Name is : "+s1.getName());
        System.out.println("Student DitNumber is : "+s1.getDit());
        System.out.println("Student Address is : "+s1.getAddress());
    }
}
