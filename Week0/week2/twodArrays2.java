package week2;

import java.util.Arrays;
import java.util.Scanner;

public class twodArrays2 {
    public static int[] flatArray(int [][] arr){
        int row= arr.length;
        int col = arr[0].length;
        int[]nums=new int[row*col];
        for(int i =0;i<row;i++)
        for(int j=0;j<col;j++)
        nums[arr[0].length*i+j]=arr[i][j];
        return nums;
    }
    static void fillArray(int [][]arr,int []nums){
        for(int i=0;i<nums.length;i++)
        arr[i/arr[0].length][i%arr[0].length]=nums[i];
    }
    static void display(int []nums){
        for(int i:nums)
        System.out.print(i+" ");
        System.out.println();
    }
    static void display2D(int [][]arr){
    for(int i=0;i<arr.length;i++)
    display(arr[i]);
}
public static void main(String[] args) {
    int[][]arr={{2,4,2,5},{4,5,3,4},{9,7,1,7}};
    int []nums=flatArray(arr);
    display(nums);
    System.out.println("sorted 2d array-:");
    Arrays.sort(nums);
    fillArray(arr,nums);
    display2D(arr);
 }
}
 


