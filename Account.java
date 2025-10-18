import java.util.Scanner;

public class Account {

    int accId;
    String accHoldername;
    String userName;
    String  salpass;
    private int password;
    private double salary;

    void setSal(double sal) {
        salary = sal;
    }

    double getsal() {
        return salary;
    }

    void setPass(int pass) {
        password = pass;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account Emoloye1 = new Account();
        Emoloye1.accId = 230712;
        Emoloye1.accHoldername = "Aditya Yadav";
        Emoloye1.userName = "aadi@123";
        Emoloye1.setSal(25000);
        Emoloye1.setPass(1234);
       Emoloye1.salpass = "chance";
        System.out.println("Enter the user name & password:");
        String enteredUserName = sc.nextLine();
        int userpass = sc.nextInt();
        sc.nextLine(); // buffer clear karne ke liye

        if (Emoloye1.userName.equals(enteredUserName) && userpass == Emoloye1.password) {

            System.out.println("Employe Name : " + Emoloye1.accHoldername);
            System.out.println("Account ID : " + Emoloye1.accId);
            System.out.println("User Name : " + Emoloye1.userName);
            System.out.println(" Enter the password for view the salary: ");
            String userSalPass = sc.nextLine();
             
        
             if (userSalPass.equals(Emoloye1.salpass))
              {

                 System.out.println("Salary : " + Emoloye1.getsal());

            } else {

                System.out.println("Invalid Password! try again");

            }

        } else {

            System.out.println("Invalid!!");
        }

        sc.close();
    }
}