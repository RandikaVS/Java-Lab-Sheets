
package tutorial_4_ex2;

public class FixedDepositAccount extends Account {
    double interestRate;
    double interest;
    
    public void setInterestRate(double r){
        this.interestRate=r;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public double calculateInterest(){
        this.interest=super.bal*interestRate/100;
        return this.interest;
    }
}
