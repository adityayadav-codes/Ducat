interface Payment {

    void pay(double amount);
}
class UpiPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment done using UPI : ₹"+amount);
    }
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {

        System.out.println("Payment done using Credit Card ₹"+amount);
    }
}
public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        p1.pay(500);
        Payment p2 = new CreditCardPayment();
        p2.pay(1000);
    }
}