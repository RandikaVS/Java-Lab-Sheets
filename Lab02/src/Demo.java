import java.util.Scanner;
public class Demo {
		
	public static void main(String args[])throws Exception {
		int n;
		boolean result;
		Scanner myScanner=new Scanner(System.in);
		System.out.print("Enter Number : ");
		n=myScanner.nextInt();
		EvenOddNumber num=new EvenOddNumber();
		
		result=num.findEvenOrOdd(n);
		if(result==true)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
}
