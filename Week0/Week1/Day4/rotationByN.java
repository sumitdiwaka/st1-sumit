 package Week1.Day4;

    public class rotationByN {
        static void rotationByOne(int [] arr, int k){
            for( int i1=0; i1<k;i1++) {
            int temp = arr[ arr.length-1];
            for(int i=arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
         }
        }
    
         static void display(int []arr){
            for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
         }
         public static void main(String []args){
            int [] arr = {1,2,3,4,5,6};
                 rotationByOne(arr,3);
                 display(arr);   
        }
}
    
    
        
    

