//PATTERN 1-FULL FILLED RECTANGLE
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// public class pattern{
//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=5;j++){
//             System.out.print("*" +" ");
//         }
//         System.out.println();
//         }
//     }
// }

//HOLLOW RECTANGLE-EMPTY FROM INSIDE 
// * * * * * 
// *       *
// *       *
// * * * * *
// public class pattern{
//     public static void main(String args[]){
//         int n =4;
//         int m=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i ==1 || i ==n || j==1||j==m){
//                     System.out.print("*" +" ");
//                 }
//                 else{
//                     System.out.print(" "+" ");
//                 }
//             }
//                             System.out.println();

            
//         }
//     }
// }

//HALF PYRAMID
// * 
// * *
// * * *
// * * * *
// public class pattern{
//     public static void main(String args[]){
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted half pyramid
// * * * * 
// * * *   
// * *     
// *   
// public class pattern{
//     public static void main(String args[]){
//         for(int i=4;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//Inverted half pyramid
//      *
//     **
//    ***
//   ****
//  *****
// ******
public class pattern{
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//full pyramid
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
// public class pattern{
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");

//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
