public class Google{
    int id;
    String name;
    int salary;
    String cName;
    void store (int id1, String name1, int salary1, String cName1) {

        id = id1;
        name = name1;
        salary = salary1;
        cName = cName1;
    }
    void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(cName);
    }
    public static void main(String[] args) {
        Google emp1 = new Google();
        emp1.store(101, "Aditya", 1212,"Infoys");
        emp1.show();
        //employee 2:
        Google emp2 = new Google();
        emp2.store(102, "Akash",2323,"Infpsys");
        emp2.show();
    }
}