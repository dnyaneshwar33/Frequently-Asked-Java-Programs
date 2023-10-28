//First n numbers in fibonacc series
class fibonacci{
    public static void main(String args[]){
        int n = 12;
        int a=0;
        int b=0;
        int c=1;
       System.out.print("First "+ n + " numbers in fibonacci series are :");

        for(int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            
        System.out.print(a+" ");
        }

    }
}

//fibonacci series till n number 
// class fibonacci{
//     public static void main(String args[]){
//         int n = 12;
//         int a=0;
//         int b=0;
//         int c=1;
//         System.out.print("Fibonacci series till "+ n + " is :");
//         while(a<=n){
        
//             a=b;
//             b=c;
//             c=a+b;
            
//         System.out.print(a+" ");
//         }
//         }
//     }
