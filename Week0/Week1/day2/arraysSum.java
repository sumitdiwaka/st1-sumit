package Week1.day2;

import java.util.Scanner;


public class arraysSum {

        public static int sumArrays(int[] arr){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
        }
       


        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in) ;
            int arr []= new int [4];
                for(int i=0;i<arr.length;i++){
                    System.out.print ("enter the value of array"+ i+ " :" );
                    arr[i]=Sc.nextInt();
                }
         
            System.out.println( "sum is "+ sumArrays(arr));  
            Sc.close();
    
}
}

