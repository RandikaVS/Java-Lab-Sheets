/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03ex2;

/**
 *
 * @author sahan
 */
public class Student {

    public String name;
    public int ditno;
    public String address;
    
    public Student(String name,int ditno,String address){
        this.name=name;
        this.ditno=ditno;
        this.address=address;
    }
    public static void main(String[] args) {
        Student s1=new Student("Sahan",001,"Homagama");
    
}
}
