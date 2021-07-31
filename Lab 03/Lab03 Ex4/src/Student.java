
public class Student {
	
	private String name;
    private String ditno;
    private String address;
    
    public void setName(String name){
        this.name=name;
    }
    public void setDit(String Dit){
        ditno=Dit;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getDit(){
        return ditno;
    }
    public String getAddress(){
        return address;
    }
    public String getDetails() {
    	return ("I am a Student."+"\n"+"My name is "+name+".\n"+"I am from "+address+".\n"+"My Dit No is "+ditno+".");
    }
}
