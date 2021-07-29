/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03ex1;

/**
 *
 * @author sahan
 */
public class Test {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.address="Homagama";
        s1.name="Sahan";
        s1.ditno=001;
        
        s2.address="Kottawa";
        s2.name="Randika";
        s2.ditno=002;
        
        System.out.println("First Student name : "+s1.name);
        System.out.println("First Student Ditno : "+s1.ditno);
        System.out.println("First Student address : "+s1.address);
         System.out.println();
        System.out.println("Second Student name : "+s2.name);
        System.out.println("Second Student Ditno : "+s2.ditno);
        System.out.println("Second Student address : "+s2.address);
        
    }
}
