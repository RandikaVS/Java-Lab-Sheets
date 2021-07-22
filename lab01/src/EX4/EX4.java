package EX4;
import java.util.*;
public class EX4 {
	public static void main(String[] args) {
		Scanner myScanner=new Scanner(System.in);
	System.out.print("Enter value of the day : ");
	int value=myScanner.nextInt();
	System.out.println("Value of the day : "+value);
	switch(value) {
	case 1:
		System.out.println("Day of the week : Monday");
		break;
	case 2:
		System.out.println("Day of the week : Tuesday");
		break;
	case 3:
		System.out.println("Day of the week : Wendsday");
		break;
	case 4:
		System.out.println("Day of the week : Thursday");
		break;
	case 5:
		System.out.println("Day of the week : Friday");
		break;
	case 6:
		System.out.println("Day of the week : Saturday");
		break;
	case 7:
		System.out.println("Day of the week : Sunday");
		break;
	default:
		System.out.println("Invalid day!!!");
	}
	System.out.println("Good bye!");
	
	}
	
}
