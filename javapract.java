PROGRAM TO CHECK NUMBER IS EVEN OR ODD
public class javapract{

    public static void main(String a[])
    {
        int num=0;
        if(num%2==0){
            System.out.println("NUMBER IS EVEN");
        }
        else if(num%2!=0){
            System.out.println("ODD NUMBER");
        }
        else
        {
            System.out.println("ENTER VALID NUMBER");
        }
    }
}

CHECK IF VALUE PRESENT IN ARRAY

public class javapract{

    public static void main(String a[])
    {
        int key =7;
        int nums[]={1,2,3,4,5};
        

        for(int i=nums[0]; i<nums.length;i++){
            if(i==key){
                System.out.println("TRUE");
                break;
            }
            
            // System.out.println(i);
        }
    
                System.out.println("FALSE");
            
    }
}


Fibonanci series in java
import java.util.Scanner;
public class javapract{
    

    public static void main(String args[]){

        int n,a=0,b=0,c=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = s.nextInt();
        System.out.println("fibonancci series is:" );

        for(int i=1;i<=n;i++){

            a=b;
            b=c;
            c=a+b;
            System.out.print(a+ " ");
        }
    }
}

leap year program
public class javapract{
    public static void main(String args[]){
        int year=2024;
        boolean is_leap_year=true;

        if(year%4==0){
            is_leap_year=true;
            if(year%100==0){
                if(year%400==0)
                 is_leap_year=true;
                else
                 is_leap_year=false;

                
            }
        }
        else 
          is_leap_year=false;

        if(is_leap_year!=true)
         System.out.println("non-leapyear");
        else
         System.out.println("leapyear");
    }
}

Java Program to Find Largest Element in an Array & also size of array
import java.util.Scanner;
import java.util.Scanner;
public class javapract{
    public static void main(String a[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=s.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elemnts :");
        
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i] > max){
                max=nums[i];
            }
        }
        System.out.println("Largest element in array is: "+ max);
        System.out.println( "Size of array is: "+ nums.length);
        
      


    }
}

java program to sort the array in ascending order
import java.util.Arrays;
import java.util.Scanner;
public class javapract{
    public static void main(String a[]){
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted elements of array are: ");
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        
        
        

    }
}

java program to sort array in descending order
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class javapract{
    public static void main(String a[]){
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted elements of array are: ");
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        
        
        

    }
}

import java.util.Arrays;
import java.util.Collections;
public class javapract{
    public static void main(String a[]){
        Integer arr[] = {3,56,87,12};
        Arrays.sort(arr, Collections.reverseOrder());
       
            System.out.println(Arrays.toString(arr));
        
    } 
}

import java.util.Arrays;
import java.util.Collections;
public class javapract {
	public static void main(String[] args)
	{  Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Modified arr[] : "
						+ Arrays.toString(arr));
	}
}


program for swapping of two numbers
import java.util.*;
public class javapract{
    public static void  main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=input.nextInt();
        System.out.println("Enter second number : ");
        int b=input.nextInt();
         

        System.out.println("Numbers before swapping : " + a +" "+ b);
        
        //logic-1
        // int temp=a;
        // a=b;
        // b=temp;

        //logic-2
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Numbers After swapping : " + a +" "+ b);

    }
}

reverse a number
import java.util.*;
public class javapract{
    public static void  main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number : ");
        int number= input.nextInt();

        int reverse=0;
        while(number!=0)
        {
            reverse = reverse*10 + number%10;
            number = number/10;
        }

        System.out.println(reverse);


    }
}

program for reversing the string
import java.util.*;
public class javapract{
    public static void  main(String args[])
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter String : ");
        String org = input.nextLine();
        String rev ="";
        int len = org.length();
        for(int i =len-1;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        System.out.println(rev);
    }
}


program to check if number/string is palindrome or not

import java.util.*;
public class javapract{

    public static void main(String a[]){
    String reverse="";
    Scanner input = new Scanner(System.in);
    System.out.println("Enter string to check: ");
    String original = input.nextLine();
    int length=original.length();

    for(int i=length-1;i>=0;i--){
        reverse=reverse+original.charAt(i);
    }
    if(original.equals(reverse)){
        System.out.println("String is palindrome");
    }
    else 
        System.out.println("String is not  palindrome");
    }
}


program to find sum of digits in number

public class javapract{

    public static void main(String args[]){
        int sum =0;

        int number = 1234;
        
        while(number>0)
        {
            
            sum=sum+number%10;
            number = number/10;
        }
        System.out.println(sum);
        
    }
    
}

program to find even and odd digits in number

public class javapract{
    public static void main(String args[]){
        int num=124578;
        int evencount=0;
        int oddcount = 0;

        while(num>0)
        {
            int rem = num%10;
            if(rem%2==0)
            {
                evencount++;

            }
            else
             oddcount++;
             num=num/10;
        }
       
        System.out.println(evencount);
        System.out.println(oddcount);

    }
}

find largest of three numbers

public class javapract{
    public static void main(String args[]){

        int a = 12;
        int b = 1;
        int c = 1;

        if(a>b && a>c)
            {
                System.out.println(" a is greater");
            }
        
        else if(b>a && b>c)
            {
                System.out.println(" b is greater");
            
        }
        else
          System.out.println("c is greater ");
    }
}


generate fibonnacci series

public class javapract{
    public static void main(String args[]){
        int n=10;
        int a,b=0;
        int c =1;
        for(int i=1;i<n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+" ");
        }

    }
}

program to search element in array
import java.util.*;
public class javapract{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array element");
        int nums[]=new int[7];
        for(int i=0;i<7;i++){
            nums[i]=input.nextInt();
        }
        System.out.println("the given array is: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        System.out.println("Enter the number to search in array: ");
        int key=input.nextInt();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                System.out.println("NUMBER FOUND AT INDEX: "+ i);
                   break;
            }
            
          
        }       

    }
}

Program to find number is prime or not
import java.util.*;
public class javapract{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO CHECK:");
        int num=input.nextInt();

        int count=0;
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }     
            }
            if(count==2){
                System.out.println("Number is prime:");
            }
            else{
             System.out.println("Not prime");
            }
        }
        else
             System.out.println("Not prime");

    }
}
program to pritn prime numbers till n

import java.util.*;
public class javapract{
public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("ENter the number till wants prime numbers");
    int n=input.nextInt();
    int flag=0;

    for(int i=0;i<=n;i++){

        for(int j=2;j<i;j++){
            if(i%j==0){
                flag=0;
                break;
            }
            else
              flag=1;
        }
        if(flag==1){
            System.out.println(i);
        }
    }
}
}

factorial of number

import java.util.*;
public class javapract{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        long factorial=1;

        for(int i=1;i<=num;i++){
            factorial=factorial * i;
        }
        System.out.println(factorial);
    }
}

find sum of elements in array
public class javapract{
    public static void main(String args[])
    {
        int num[]={1,2,3,4};
        int sum=0;

        for(int i=0;i<=num.length;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

find even and odd numbers from array
public class javapract{
    public static void main(String args[])
    {
        int num[]={12,34,54,23,88,76,55,34,23};
        
        
        System.out.print("Even elements are: ");
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                System.out.print(num[i] +" ");
            }
        }
        System.out.println();
        System.out.print("odd elements are: ");
        for(int i=0;i<num.length;i++){
            if(num[i]%2!=0){
                System.out.print(num[i] +" ");
            }
        }
        
    }
}

check equality of two arrays
import java.util.*;
 public class javapract{
    public static void main(String args[])
    {
        int num1[]={1,2,3,4};
        int num2[]={1,2,3,4};

        boolean status=Arrays.equals(num1,num2);

        if(status==true)
          System.out.println("Arrays are equal");

        else
           System.out.println("Arrays are not equal");
    }
}

FIND MAX AND MIN ELEMENT OF ARRAY
  public class javapract{
    public static void main(String args[])
    {
        int num1[]={11,45,675,322,56};
       int max=num1[0];
       for(int i=0;i<num1.length;i++){
        if(num1[i]>max){
            max=num1[i];
        }
       }
       System.out.println("Max element in array is: " + max);

    int min=num1[0];
       for(int i=0;i<num1.length;i++){
        if(num1[i]<min){
            min=num1[i];
        }
       }
       System.out.println("Max element in array is: " + min);
}
  }

FIND DUPLICATE ELEMENT IN ARRAY
public class javapract{
    public static void main(String args[]){
        boolean flag=false;
        int nums[]={1,3,5,6,7,3,5};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println("array  contain duplicates "+ nums[i]);
                    flag=true;
                }
                
            }

        }
        if(flag==false){
            System.out.println("array does not contain duplicates");
        }
        
          
    }
}

remove whitespaces from string
public class javapract{
    public static void main(String args[]){
        String greet="Welcome to game";

        String newz = greet.replaceAll(" ","");
        System.out.println(newz) ;
    }
}
removing special characters from string
public class javapract{
    public static void main(String args[]){
        String s ="j!a$v@a*";
        String newstring = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newstring);
    }
}

count words in string

public class javapract{
    public static void main(String args[]){
        String greet="Welcome to java";
        int count=greet.split("\\s").length;
        System.out.println(count);
    }
}

find occurences of word in string
public class javapract{
    public static void main(String args[]){
        String s="hello i am learning lovely langauge java";
        int totalcount= s.length();
        System.out.println(totalcount);
        int wordcount = s.replace("l","").length();
        System.out.println(wordcount);
        int occurencecount=totalcount-wordcount;
        System.out.println("occurences of word are:"+ occurencecount);



    }
}

bubble sort
public class javapract{
     public static void printarray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    public static void main(String args[]){
        int arr[]={9,3,5,7,1};
       

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarray(arr);
    }
}

selection sort
public class javapract{
     public static void printarray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    public static void main(String args[]){
        int arr[]={9,3,5,7,1};
       
       
       for(int i=0;i<arr.length;i++){
        int smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }

        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
       }
        printarray(arr);
    }
}

binary search