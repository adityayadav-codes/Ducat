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
// public class Temp0{
//     public static void main (String args [])	{
	
// 		double GPA = 7.5;
// 		int attendance = 70;
// 		 boolean  isEligible = SEC(GPA , attendance);
			
// 			if(isEligible)	{
			
// 				System.out.println("You r eligible  for scholarship!");
// 	}	else {
				
// 				System.out.println("you r not eligible");
// 	}
// 	}
//      public static boolean SEC(double GPA, int attendance){
        
//             return (GPA >=7.0 && attendance >=75);
// 	}
// }

// 9.
// public class Temp0{
//     public static void main(String args []){
// 	int num = 15;
		
// 		if(num % 3 ==0 && num % 5==0)	{
		
// 			System.out.print("this number is multiple of 3 and 5 is: ");
// 			System.out.println(+num);
// 	} else {
		
// 			System.out.println("it’s not");
// 	}
// }
 //}
 // 10.
// a java program  to check if a string contains a specific substring
//  public class Temp0{
//      public static void main (String args [])	{
    
//         String str = "Hello, welcome to the world of Java programming.";
//         String substring = "Java";
//          boolean  containsSubstring = checkSubstring(str , substring);
            
//             if(containsSubstring)	{
            
//                 System.out.println("The string contains the substring: " + substring);
//     }	else {
                
//                 System.out.println("The string does not contain the substring: " + substring);
//     }
//     }
//      public static boolean checkSubstring(String str, String substring){
        
//             return str.contains(substring);
            
//     }
//  }

// 11.
// a java program to check if a person is eligible for a job based on their age, education, and experience using nested if-else statements
 public class Temp0{
     public static void main (String args [])	{
    
        int age = 30;
        String education = "Bachelor's Degree";
        int experience = 5;
         boolean  isEligible = checkEligibility(age , education, experience);
            
            if(isEligible)	{
            
                System.out.println("You are eligible for the job.");
    }	else {
                
                System.out.println("You are not eligible for the job.");
    }
    }
     public static boolean checkEligibility(int age, String education, int experience){
        
            if(age >= 21 && age <= 60)	{
            
                if(education.equals("Bachelor's Degree") || education.equals("Master's Degree"))	{
                
                    if(experience >= 2)	{
                    
                        return true;
        }	else {
                        
                        return false;
        }
    }	else {
                    
                    return false;
    }
}	else {
                
                return false;
    }
    }
 }