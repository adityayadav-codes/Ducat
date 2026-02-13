
abstract class Bank {
    abstract void deposit();
   abstract void withdraw();
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