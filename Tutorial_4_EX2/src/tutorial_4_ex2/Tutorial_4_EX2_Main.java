
package tutorial_4_ex2;

public class Tutorial_4_EX2_Main {


    public static void main(String[] args) {
        
        FixedDepositAccount f1=new FixedDepositAccount();
        SavingAccount s1=new SavingAccount();
        
        f1.deposit(1000);
        s1.deposit(1000);
        s1.withdraw(500);
        f1.display();
        s1.display();
    }
    
}
