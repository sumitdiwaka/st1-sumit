package Week1.Day4.Week2;

public class leetcode26 {
    public int removeDuplicates(int [] nums){
        int i =0;
        for(int j = 1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,2,2,3,3,34};
            removeDuplicates(arr);
        
    }
    
}
