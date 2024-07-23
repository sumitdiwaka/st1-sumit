package Week1.Day4.Week2.Day2;

public class nsr {
    static void display(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    static void ngrNie(int [] nums, int arr[]){
        int minR= 100;
        for(int i =nums.length-1; i>=0;i--){
            minR= Math.min(minR,nums[i]);
            arr[i] = minR;
        }
        }

    static void ngrNi(int [] nums, int arr[]){
        int minR= 100;
        for(int i =nums.length-1; i>=0;i--){
            arr[i] = minR;
            minR= Math.min(minR,nums[i]);
        }
    }
  public static void main(String[] args) {
    int []  nums = {2,3,4,62,5,8};
    int []  arr = new int [nums.length];
    ngrNie(nums, arr);
    display(arr);
    }
}

