package Week1.Day4.Week2.Day2;

public class ngl {
        static void display(int []arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        // current element not include 
        static void ngrNie(int [] nums, int arr[]){
            int maxR= 0;
            for(int i =0; i<nums.length;i++){
                maxR= Math.max(maxR,nums[i]);
                arr[i] = maxR;
            }
            }
    
        static void ngrNi(int [] nums, int arr[]){
            int maxR= 0;
            for(int i =0; i<nums.length;i++){
                arr[i] = maxR;
                maxR= Math.max(maxR,nums[i]);
            }
        }
      public static void main(String[] args) {
        int []  nums = {2,3,4,62,5,8};
        int []  arr = new int [nums.length];
        ngrNi(nums, arr);
        display(arr);
        }
    }
    
    

