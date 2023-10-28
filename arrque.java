//Program to print the elements of an array in reverse order
// public class arrque{
//     public static void main(String args[]){

//         int nums[]={2,3,4,5,67,77};
//         System.out.println("Elemenets of array in reverse order are:");
//         for(int i = nums.length-1;i>=0;i--){
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

//Program to print the elements of an array present on even and odd position
// public class arrque{
//     public static void main(String args[]){
//         int nums[]={2,3,4,5,7,88,33,54,12};
//         System.out.println("Elements present at even position are:");
//         for(int i=0;i<nums.length;i++){
//             if(i%2==0){
//                 System.out.print(nums[i]+" ");
//             }
//         }
//         System.out.println();
//         System.out.println("Elements present at odd position are:");
//         for(int i=0;i<nums.length;i++){
//             if(i%2!=0){
//                 System.out.print(nums[i]+" ");
//             }
//         }
//     }
// }
//Program to print the largest and smallest element in an array
// public class arrque{
//     public static void main(String args[]){
//         int nums[]={12,45,456,77,33,11,98};
//         int max = 0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>max){
//                 max=nums[i];
//             }
//         }

//         System.out.println("largest element from the array is "+max);

//         int min = nums[0];
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]<min){
//                 min=nums[i];
//             }
//         }

//         System.out.println("smallest element from the array is " +min);

//         System.out.println("total elements in array are:"+nums.length);
//     }
// }

//remove duplicates
import java.util.*;
public class arrque{
    public static void main(String args[]){
        int nums[]={12,34,54,12,34,55,77};
         System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i]=-1;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){
                System.out.print(nums[i]+" ");
            }
        }
   

    }


}