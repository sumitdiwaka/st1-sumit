package Week1;

public class binarySearchingOfLowerbound {
    public static int binarySearchLowerBound(int arr[],int key){
        int ans= -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start +end)/2;
            if (arr[mid]== key) {
                ans = mid;
                  end = mid-1; }
               else if(arr[mid]>key)
                end = mid-1;
                else
                start = mid +1;
                }
                return ans;
        }

        public static void main(String[] args){
            int arr[] ={1,2,4,4,5,6,7};
        
           System.err.println( binarySearchLowerBound(arr,4  ));
        }
    }
    



