/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialw2_ex2;

/**
 *
 * @author sahan
 */
public class PointApp {
    
    public static void main(String args[]){
        double dis1,dis2;
        Point3D p1=new Point3D();
        Point3D p2=new Point3D();
        dis1=p1.distance(10,20,30);
        dis2=p2.distance(15,25,30);
        System.out.println("Distance of first object : "+dis1);
        System.out.println("Distance of second object : "+dis2);
    }
    
}
