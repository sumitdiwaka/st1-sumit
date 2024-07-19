package Week1.Day4;

public class SumOfSubarray {
    public static void printSubArray( int [] arr){
        for(int i=0;i<=arr.length;i++){
            for(int j=i; j<arr.length;j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                  sum+=arr[k];
                    System.out.print(sum+ " ");
                    System.out.println();
                }  
                

            }
        }

    }
    public static void main(String []args){
        int [] arr = {1,2,3,4,5,6};
        printSubArray(arr);
    }

    
}
    
