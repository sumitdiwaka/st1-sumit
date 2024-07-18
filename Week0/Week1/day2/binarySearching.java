package Week1.day2;

public class binarySearching {
    public static int binarySearchLowerBound(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start +end)/2;
            if (arr[mid]== key) {
                  return mid; }
               else if(arr[mid]>key)
                end = mid-1;
                else
                start = mid +1;
                }
                return -1;
        }

        public static void main(String[] args){
            int arr[] ={1,2,4,4,5,6,7};
        
           System.err.println( binarySearchLowerBound(arr,6  ));
        }
    }
    




    

