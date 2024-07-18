package Week1.day2;

import java.util.Scanner;

public class arrayrevrsing {
    public static void reverse( int [ ] arr){
        int temp = 0;
        int n = arr.length;
        for(int i=0;i<n/2;i++)  {
        temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
    }  
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}
        public static void main (String[] args){
       int arr []= new int [10];
             Scanner Sc= new Scanner(System.in) ;
             System.err.print(" enter the elements of array ");
             System.out.println(" input the array");
                for(int i=0;i<arr.length;i++){
                    arr[i]=Sc.nextInt();
                }
                System.out.println(" reverse of the no is ");
               reverse(arr);
 }
}
