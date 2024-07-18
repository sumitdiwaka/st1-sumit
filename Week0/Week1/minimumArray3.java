package Week1;

public class minimumArray3 {
        public static int minimumArrays(int [] arr){
            int temp= 0;
            int n = arr.length;
            for(int i=1 ;i<n;i++){
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
           System.out.println(" minimum    no in array is = " +  minimumArrays(arr));
        }
        
    }
    
    
