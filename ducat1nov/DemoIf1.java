

 public class DemoIf1 {
public static void main(String args []){

        for (int i =1; i<=5; i++) {

                for (int j=1; j<=5;j++){

                        System.out.print("* ");
                }
                System.out.println();
        }
}
    
}
//pattern 1
//  2
public class DemoIf1 {
	
		public static void main (String args [])	{

				for (int i =1;i <=5;i++)	{
			
					for (int j =1;j <= i; j++) 	{
			
					System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}
//pattern 2
public class DemoIf1 {

		public static void main (String args [])	{
	
			for (int i =1;i <= 5;i++)	{
		
			for(int j = 1; j <= 5;j++)	{

				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
 }

//pattern 3
public class DemoIf1 {

        public static void main(String[] args) {
            for (int i =0;i<=5;i++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
}

/*
 A 
 B B
C C C
D D D D
E E E E E
 */
//pattern 4
public class DemoIf1 {

        public static void main (String args [])    {

                for (int i =65; i <=69; i++){

                    for (int j =65; j <=i; j++){

                        System.out.print((char)i +" ");

                    }
                    System.out.println();
                }
        }
}

//pattern 5
public class DemoIf1
{
    public static void main (String args []){

            for (int i =65; i<=69;i++){

                for (int j = 65;i >= j;j++){

                    System.out.print((char)j +" ");
                }
                System.out.println();
            }
    }
}

//pattern 6
public class DemoIf1 {

        public static void main (String args [])
        {
            for (char i = 'a';i <= 'e'; i++){
                for (char j = 'a';j <= i; j++){

                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
}

//pattern 7
public class DemoIf1{

        public static void main (String args [])
        {

            for(char i = 'a'; i <='e';i++){
                for (char j = 'a'; j<='e';j++){
                    System.out.print(j +" ");   
                }
                System.out.println();
            }
        }
}

//pattern 8
public class DemoIf1{
    public static void main (String args []){

        for (char i = 'a'; i<='e';i++){
            for (char j = 'a'; j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}