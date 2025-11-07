public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
           void addition(){
            return a + b;
         }
          void subtraction() {
            return b - a;
         }
         int choice = 2;
         do {
            switch (choice) {
                case 1:
                    {   
                        System.out.println(addition());
                        break;
                    }  
                    case 2:
                    {   
                        System.out.println(subtraction());
                        break;
                    }      
                    default:
                    break;
            }
         } while (choice>=0);
    }
}
