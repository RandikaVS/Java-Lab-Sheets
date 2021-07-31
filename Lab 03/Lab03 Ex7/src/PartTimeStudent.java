
class PartTimeStudent extends Student {
	private double WH;
	
	public PartTimeStudent(double WH) {
		this.WH=WH;
	}
	public void showDetails() {
		System.out.println("Name is : "+name+"\n"+"Address is : "+address+"\n"+"Student Id : "+stuId+"\n"+"Number of Working Hours: "+WH+"\n");
	}

}
