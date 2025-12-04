// public class Google{
//     int id;
//     String name;
//     int salary;
//     String cName;
//     void store (int id1, String name1, int salary1, String cName1) {

//         id = id1;
//         name = name1;
//         salary = salary1;
//         cName = cName1;
//     }
//     void show(){
//         System.out.print("=====================");
//         System.out.println();
//         System.out.println(id);
//         System.out.println(name);
//         System.out.println(salary);
//         System.out.println(cName);
        
//     }
//     public static void main(String[] args) {
//         Google emp1 = new Google();
//         emp1.store(101, "Aditya", 1212,"Infoys");
//         emp1.show();
//         //employee 2:
//         Google emp2 = new Google();
//         emp2.store(102, "Akash",2323,"Infpsys");
//         emp2.show();
//         Google emp3 = new Google();
//         emp3.store(103, "ANIL", 2322, "Infosys");
//         emp3.show();
//     }
// }

//static data member

// public  class Google{

//     int id;
//     String name;
//     int salary;
//     static String cName = "Google";

//         void store(int id1, String name1, int salary1) {

//             id = id1;
//             name = name1;
//             salary = salary1;
//         }
//         //consoole
//         void show() {
//             System.out.println("=============================");
//             System.out.println("ID              : "+id);
//             System.out.println("Name            : "+name);
//             System.out.println("Salalry         : "+salary);
//             System.out.println("Company Name    : "+cName);

//         }
//     public static void main(String args []) {

//             // Employee 1:
//             Google emp1 = new Google();
//             emp1.store(101, "Aadi", 23232);
//             emp1.show();

//             //Employee 2:
//             Google emp2 = new Google();
//             emp2.store(102, "Akki", 4342);
//             emp2.show();

//             //Employee 3:
//             Google emp3 = new Google();
//             emp3.store(103, "Anil", 5433);
//             emp3.show();
//     }
// }


// // Data Shadowing
// public  class Google {
//         int id ;
//         String name;
//         int salary;
//         static String cName = "Google";
//         void store(int id, String name, int salary,Google emp){
//             emp.id = id;
//             emp.name = name;
//             emp.salary = salary;
//         }
//         void show() {
//             System.out.println("==============================");
//             System.out.println("ID              : "+id);
//             System.out.println("Name            : "+name);
//             System.out.println("Salary          : "+salary);
//             System.out.println("Company Name    : "+cName);
//         }
//         public static void main(String args []) {
//             //Employee 1:
//             Google emp1 = new Google();
//             emp1.store(101,"Aadi",23232,emp1);
//             emp1.show();
//             //Employee 2:
//             Google emp2 = new Google();
//             emp2.store(102,"Akki",3232,emp2);
//             emp2.show();
//             //Employee 3:
//             Google emp3 = new Google();
//             emp3.store(103,"Anil",5433,emp3);
//             emp3.show();
//         }›
//     }

// //this Keyword
//     public  class Google {
//             int id ;
//             String name;
//             int salary;
//             static String cName = "Google";
//             void store(int id, String name, int salary){
//                 this.id = id;
//                 this.name = name;
//                 this.salary = salary;
//             }
//             void show() {
//                 System.out.println("==============================");
//                 System.out.println("ID              : "+id);
//                 System.out.println("Name            : "+name);
//                 System.out.println("Salary          : "+salary);
//                 System.out.println("Company Name    : "+cName);
//             }
//             public static void main(String args []) {
//                 //Employee 1:
//                 Google emp1 = new Google();
//                 emp1.store(101,"Aadi",23232);
//                 emp1.show();
//                 //Employee 2:
//                 Google emp2 = new Google();
//                 emp2.store(102,"Akki",3232);
//                 emp2.show();
//                 //Employee 3:
//                 Google emp3 = new Google();
//                 emp3.store(103,"Anil",5433);
//                 emp3.show();
//             }
//         }

//Parameterized Constructor
public class Google {
    int id;
    String name;
    int salary;
    static String cName = "Google";

    //Parameterized Constructor
   Google(int id, Stirng name, int salary )v {
    this.id = id;
    this.name = name;
    this.salary = salary;
   }
   void show() {
    System.out.println("===============================");
    System.out.println("ID              : "+id);
    System.out.println("Name            : "+name);
    System.out.println("Salary          : "+salary);
    System.out.println("Company Name    : "+cName);
   }
    public static void main(String args []) {
        //Employee 1:
        Google emp1 = new Google(230714,"Aditya Yadav",23231);
        emp1.show();
        //Employee 2:
        Google emp2 = new Google(230715,"Akash Yadav",32325);
    }
}