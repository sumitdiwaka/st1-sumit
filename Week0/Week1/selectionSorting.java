package Week1;

public class selectionSorting {
    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx= minimumValue(arr, i);
            int temp=arr[i];
            arr[i]= arr[idx];
            arr[idx]=temp;
        }
    }
    static int minimumValue(int[] arr, int a){
        int mini= a;
        for(int i=a+1; i<arr.length;i++)
            if(arr[mini]>arr[i])
                mini=i;
        return mini;
    }
    public static void display(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        int [] arr ={5,123,5,4,9,87,324};
    
       selectionSort(arr );
        display(arr);
    }
    
}
