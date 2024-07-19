package Week1.Day4;

public class kadaneeAlgo {
    public static int kadaneAlgo(int []arr){
        int maxSum = Integer.MIN_VALUE;
        int currrentSum= 0;
        for(int i=0;i<arr.length; i++){
            currrentSum += arr[i];
            maxSum=Math.max(currrentSum,maxSum);
            if(currrentSum<0){
                currrentSum=0;
            }

        }
        return maxSum;
    }
    public static void main(String []args){
        int [] arr = {-1,-2,3,4,5,6};
       System.out.println( kadaneAlgo(arr));
    }



    
}
