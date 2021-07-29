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
public class Student {

    private String name;
    private String ditno;
    private String address;
    
    public void setName(String name){
        this.name=name;
    }
    public void setDit(String Dit){
        ditno=Dit;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getDit(){
        return ditno;
    }
    public String getAddress(){
        return address;
    }
    
}
