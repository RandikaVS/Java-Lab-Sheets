
package tutorial_4_ex2;

public class SavingAccount extends FixedDepositAccount{
    
    public void withdraw(double a){
        super.bal=super.bal-a;
    }
    public double calculateInterest(){
        return super.interest=super.bal*super.interestRate/100/12;
    }
    public void DisplayInterest(){
        System.out.println("Interest : "+super.interest);
    }
}
