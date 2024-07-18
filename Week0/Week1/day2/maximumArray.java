package Week1.day2;

public class maximumArray {
    public static int maximumArrays(int [] arr){
        int temp= 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>temp){
                temp = arr[i];
                }
            else
            continue;

        }
        return temp;


    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,55,98,7};
       System.out.println(" maximum no in array is = " +  maximumArrays(arr));
    }
    
}
