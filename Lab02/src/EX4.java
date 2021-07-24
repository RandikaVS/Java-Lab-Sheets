import java.io.*;
public class EX4 {
	
	public static void main(String [] args)throws Exception {
	int wid,len,hei;
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br =new BufferedReader(isr);
	
	System.out.print("Enter Length of the box : ");
	len=Integer.parseInt(br.readLine());
	System.out.print("Enter Width of the box : ");
	wid=Integer.parseInt(br.readLine());
	System.out.print("Enter Height of the box : ");
	hei=Integer.parseInt(br.readLine());
	
	System.out.println("Volume of the box is : "+len*wid*hei+" cm3");
	}
}
