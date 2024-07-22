package Week1.Day4.Week2.Day1;

public class dutuschAlgo {
    public static void swap(int [] nums , int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;

    }
    public static void sortColours(int []nums){
    int low =0;
    int mid =0;
    int high = nums.length;
    while(mid>high){
        if(nums[mid]==0){
         swap(nums ,low, mid);
            low++;
            mid++;
            }
            else if( nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
            }
        }

    }
   public static void display(int [] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ "");
        }
    }
    public static void main(String[] args) {
        int [] arr = { 2,2,1,2,0,0,1,2,1,0};
           sortColours(arr);
           display(arr);

    }
}

    
