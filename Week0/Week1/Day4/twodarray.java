package Week1.Day4;
import java.util.*;

public class twodarray {
    // create a function to search a number and return the index
    public static int[] searchingArray(int [][] arr,int n){
        int[] arr1 = {-1,-1};
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
              if(arr[i][j]== n)
              arr1[0]=i;
              arr1[1]=j;
        }
    }
    return arr1;
    }
    public static void insert (int [][] arr){
        int num =1;
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = num++;
            }
        }
    }
    public static void display(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static int [][] transpose(int [][]arr){
        int [][] nums = new int [arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                nums[j][i]= arr[i][j];
                return nums;
        
    }
    
    public static void main(String[] args) {
     // datatype [][] name of 2d array = new(memmory) same datatype [size][size]
        int [][] arr = new int [5][3];
        insert(arr);
        display(arr);
        System.out.println("transpose of a matrix is -:");
       int [][] nums = transpose(arr);
        display(nums);
       
    }
}
