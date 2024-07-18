package Week1;

public class insertionSorting {
   public static void insertionSort(int []arr){
     int  n = arr.length;
     for(int i =1;i<n;i++){
           int key =  arr[i];
           int j =i -1;
           while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j--];
           }
           arr[j+1]= key;
       }

   }
      public static void display(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        int [] arr ={5,123,5,4,9,87,324};
    
       insertionSort(arr );
        display(arr);
    }
    
}
