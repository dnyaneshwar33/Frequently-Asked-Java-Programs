//check whether given num is prime or not
// public class primenum{
//     public static void main(String args[]){
//      int num =5;
//      int count=0;
//      for(int i=1;i<=num;i++){
//         if(num%i==0){
//             count++;
//         }
//      }

//      if(count==2){
//         System.out.println("the number "+ num +" is prime");
//      }

//      else{          
//         System.out.println("the number "+ num +" is not  prime");

//      }
//     }
// }

//print prime numbers till n 

public class primenum{
    public static void main(String args[]){
        int n =100;
        
        System.out.print("Primes numbers till "+n+" are: ");
        for(int i=2;i<n;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
            System.out.print(i+" ");
        }
        }
        
    }
}