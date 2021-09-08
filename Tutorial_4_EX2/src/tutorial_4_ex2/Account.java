
package tutorial_4_ex2;


public abstract class Account {
    
    private int accNo;
    private String Name;
    protected double bal;
    
    public void deposit(double val){
        this.bal=val+bal;
    }
    public Account(){}
    public Account(int no,String n,double b){
        this.accNo=no;
        this.Name=n;
        this.bal=b;
    }
    
    abstract public double calculateInterest();
    
    public void display(){
        System.out.println("Account No : "+this.accNo+"\n"+"Name : "+this.Name+"\n"+"Account Balance : "+this.bal+"\n");
    }
    
}
