
public class Main {
	public static void main(String[] args){
		
		Pet p = new Pet("Lissie","Smith",3);
		p.showDetails();
		
		Cat c = new Cat("Kyan", "Silva", 4, 4);
		c.showDetails();
		
		Pet newP=new Pet("Tutu","0");
		newP.showDetails();
		
		Cat newCat=new Cat("Kitty","0");
		newCat.showDetails();
		
		Dog newDog=new Dog("Tommy","0");
		newDog.showDetails();
		
		Dog d1=new Dog("Bruno","0",0,1);
		d1.showDetails();
		
		Dog d2=new Dog("Blacky","0",0,1);
		d2.showDetails();
		

	}
}