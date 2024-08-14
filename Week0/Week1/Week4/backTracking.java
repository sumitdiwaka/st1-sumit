package Week1.Week4;

public class backTracking {
    static int sum=0;
    public static boolean backtracking(int []arr,int i,int k){
        if(i==arr.length)
        return true;
        if(sum>k)
        return false;
        sum+=arr[i];
        if(!backtracking(arr, i+1, k)){
        sum-=arr[i];
        }
        return true;
    }
static void sumArray(int [] arr,int i,int k){
if(arr.length==i)
 return;
sum+=arr[i];
if(sum>k){
    sum-=arr[i];
    return;
}
sumArray(arr, i+1,k);
}


    public static void main(String[] args){
        int []arr= {1,3,5,4,7,6};
      backtracking(arr, 0,15);
      System.out.println(sum);
    }
}

