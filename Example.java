public class Example{
    
    int x = 50;
        public void method(){
           
            int x = 100;
                System.out.println("Local Variable : "+x);
                System.out.println("Instance Variable : "+this.x);
     }    
public static void main(String args []) {
        Example obj = new Example();
        obj.method();
    }
}
