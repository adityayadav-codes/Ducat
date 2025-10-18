import java.util.Scanner;
public class Main {

    protected double salary;
   String name;
   String dept;
   String subject;
   void changDept( String dep)   {
      dept = dep;
   }
   public static void main(String[] args) {
      
     Main obj = new Main();
     obj.name = "Charu Singh";
     obj.dept = "CS";
     obj.salary = 100000;
     obj.subject = "C Programming";
     obj.changDept("Management");
     System.out.println("Name         : "+obj.name );
      System.out.println("Department   : "+obj.dept );
       System.out.println("Subject      : "+obj.subject); 
       final  int salaryPass = 1234;
       System.out.println("Enter password for view Salary: ");
       Scanner sc = new Scanner(System.in);
       int userPass = sc.nextInt();
       if ( userPass == salaryPass) {
         
         System.out.println("Salary       : "+obj.salary);
       } else {
         System.out.println(" Wrong Password🚫 Please try again‼️");
       }


   }
   
}