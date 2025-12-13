
abstract class Bank {
    abstract void deposit();
   abstract void withdraw();
}
class SavingAccount extends Bank {
    @Override
        public void deposit(){
            System.out.println("Depositing Amount in Saving Accounts");    
    }
    @Override
        public void withdraw(){
            System.out.println("Withdraw Amount from Savings Account");
}
class CurrentAccount extends Bank {
    @Override
        public void deposit(){
            System.out.println("Depositing Amount in Current Accounts");    
        }
    @Override
        public void withdraw(){
            System.out.println("Withdraw Amount from Current Account");
        }
    } 
}
public class MainBank {
        public static void main (String args [] ) {
            Bank bank1 = new SavingAccout();
            Bank bank2 = new CurrentAccount();
            bank1.deposit();
            bank1.withdraw();
            bank2.deposit();
            bank2.withdraw();
            System.out.println("Polymorphism in Java");   
    }
}