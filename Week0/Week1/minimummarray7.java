package Week1;

public class minimummarray7 {
    public static int minimumArrays1(int [] arr, int a){
        int temp= a;
        int n = arr.length;
        for(int i=a+1; i<n;i++){
            if(arr[temp]>arr[i]){
                temp = i;
                }
            else
            continue;

        }
        return temp;


    }
    public static void main(String[] args) {
        int[]arr = {34,1,3,55,98,7};
       System.out.println(" minimum    no in array is = " +  minimumArrays1(arr,2));
    }
    
}




    
