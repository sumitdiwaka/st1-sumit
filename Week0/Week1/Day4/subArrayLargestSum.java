package Week1.Day4;

public class subArrayLargestSum {
    public static void printSubArray( int [] arr){
        int maximum =0;
        for(int i=0;i<=arr.length;i++){
            for(int j=i; j<arr.length;j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                  sum+=arr[k];
                  maximum=Math.max(sum,maximum);
                    
                }  
                
                

            }
            
        }
            System.out.println(maximum);

    }
    public static void main(String []args){
        int [] arr = {1,2,3,4,5,6};
        printSubArray(arr);
    }

    
}
    
