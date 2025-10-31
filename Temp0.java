// 
// 7.
// a java program to check if a student is eligible for a load based on their income and credit score
// public class Temp0{
//     public static void main (String args [])	{
    
//         double income = 50000;
//         double creditScore = 880;
//          boolean  isEligible = cla(income , creditScore);
    
    
//             if(isEligible)	{
        
//                 System.out.println("Your are eligible for load");
//     } else {
                
//                 System.out.println("YOU r not eligible");	
//     }
//     }
//      public static boolean cla(double income, double creditScore){
        
//             return (income >=50000 && creditScore >=500);
//     }
// }

// 8.
public class Temp0{
    public static void main (String args [])	{
	
		double GPA = 7.5;
		int attendance = 70;
		 boolean  isEligible = SEC(GPA , attendance);
			
			if(isEligible)	{
			
				System.out.println("You r eligible  for scholarship!");
	}	else {
				
				System.out.println("you r not eligible");
	}
	}
     public static boolean SEC(double GPA, int attendance){
        
            return (GPA >=7.0 && attendance >=75);
	}
}
