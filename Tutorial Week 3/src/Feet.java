
public class Feet {
	private int feet;
	private int inches;
	
	public Feet(int feet,int inches) {
		this.feet=feet;
		this.inches=inches;
	}
	
	public void add(Feet f1,Feet f2) {
		int sumFeet=f1.feet+f2.feet;
		int sumInches=f1.inches+f2.inches;
		this.feet=sumFeet=sumFeet+sumInches/12;
		this.inches=sumInches%12;
	}
	public void print(String msg) {
		System.out.println(msg+" : "+feet+"'"+inches+"\"");
	}
	public Feet(Feet len) {
		Feet newFeet=new Feet(len.feet,len.inches);
	}
	public void add(Feet f1) {
		int sumFeet=f1.feet+this.feet;
		int sumInches=f1.inches+this.inches;
		sumFeet=sumFeet+sumInches/12;
		sumInches=sumInches%12;
		f1.feet=sumFeet;
		f1.inches=sumInches;
	}
	public static void print(Feet f) {
		System.out.println("Length : "+f.feet+"'"+f.inches+"\"");
	}
	public static Feet add(Feet f1,Feet f2,Feet f3) {
		Feet fobj=new Feet(0,0);
		fobj.feet=f1.feet+f2.feet+f3.feet;
		int totinches=f1.inches+f2.inches+f3.inches;
		fobj.feet=fobj.feet+totinches/12;
		fobj.inches=totinches%12;
		return fobj;
	}
	
	public static void main(String args[]) {
		Feet myFeet1=new Feet(5,6);
		Feet myFeet2=new Feet(6,7);
		myFeet1.print("Length");
		Feet newOb=new Feet(0,0);
		newOb.add(myFeet1,myFeet2);
		newOb.print("Length");
		Feet newLen=new Feet(5,6);
		myFeet2.add(newLen);
		newLen.print("Length");
		Feet.print(myFeet2);
		Feet obj=Feet.add(myFeet1,myFeet2,newLen);
		Feet.print(obj);
	}
}
