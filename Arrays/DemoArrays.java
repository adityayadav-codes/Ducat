// public class DemoArrays {

//     public static void main(String [] args) {

//         int [] x = {10,20,30,40,50};

//         for(int i =0; i < x.length; i++) {
//             System.out.println(x[i]);
//         }
//     }
// }

// Multi-dimensional Arrays

public class DemoArrays {
    public static void main(String [] args) {

        int [][]x = {{10,20,30}, {20,40,60}, {10,30,70}};
        
        for(int i =0; i < x.length; i++) {

            for(int j =0; j < x[i].length; j++) {

                System.out.print(x[i][j]+ " ");
            }

            System.out.println();
         }
    }
}