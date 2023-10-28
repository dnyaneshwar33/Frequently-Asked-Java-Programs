//Java Program to count the total number of characters in a string
// public class stringque{
//     public static void main(String args[]){
//         String name ="Yog   esh";
       
//         int count =0; 
//         for(int i=0;i<name.length();i++){
//             if(name.charAt(i)!=' '){
//                 count++;
//             }
//         }
//         System.out.println(count);

//     }
// }

//Find duplicates from the string
public class stringque{
    public static void main(String args[]){
        String name ="Dnyaneshwar vighne";
        for(int i=0;i<name.length();i++){
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j) ){
                    System.out.print(name.charAt(i));
                }
            }
        }
    }
}