import java.util.*;
public class EX3 {
	
	public static void main(String args[])throws Exception{
		Scanner myScanner=new Scanner(System.in);
		int len,wid,hei;
		//double volume;
		System.out.print("Enter Length of box : ");
		len=myScanner.nextInt();
		System.out.print("Enter Width of box : ");
		wid=myScanner.nextInt();
		System.out.print("Enter Height of box : ");
		hei=myScanner.nextInt();
		System.out.println("Volume of the box is :"+len*wid*hei+" cm3");
		
	}
}
