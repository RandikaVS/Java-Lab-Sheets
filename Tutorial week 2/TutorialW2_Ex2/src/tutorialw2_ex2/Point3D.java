package tutorialw2_ex2;

/**
 *
 * @author sahan
 */
import java.lang.Math;
public class Point3D {
    
    public Point3D(){
        double c1=0,c2=0,c3=0;
    }
    public double distance(double d1,double d2,double d3){
        double dis;
        dis=Math.sqrt(d1*d1+d2*d2+d3*d3);
        return dis;
    }
    
}

