import java.io.*;

public class Buffer{

	public static void main(String [] args)throws Exception{
		String name;
		int age;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		
		System.out.print("Enter your name here : ");
		name=br.readLine();
		System.out.print("Enter your age here : ");
		age=Integer.parseInt(br.readLine());

		System.out.print("Your name is : "+name+"\n"+"Your age is : "+age);
}
}