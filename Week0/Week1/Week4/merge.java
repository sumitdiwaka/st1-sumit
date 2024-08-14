package Week1.Week4;

public class merge {
   static void merge(int []arr,int low,int mid ,int high){
   int size = high-low+1;
    int [] temp=new int[size];
    int i=mid ,j=high,k=size-1;
    while(i>=low && j>=mid+1){
        if(arr[i]>arr[k]){
            temp[k]=arr[i];
            i--;
        }else{
            temp[k]=arr[j];
            j--;
        }
        k--;

    }
    while(i>=low){
        temp[k]=arr[i];
        i--;
        k--;
    }
    while(j>=mid+1){
    temp[k]=arr[j];
    k--;
    j--;
    }
    for(i=low;i<=mid;i++){
        arr[i]=temp[i-low];
    }
   }
   static void mergeSort(int[] arr, int low, int high){
    if(low<high){
    int mid = (high+low)/2;
    mergeSort(arr, 0, mid);
    mergeSort(arr, mid+1, high);
    merge(arr, low, mid, high);
    }
}
static int sum=0;
static void sumArray(int [] arr,int i){
if(arr.length==i)
 return;
sum+=arr[i];
sumArray(arr, i+1);
}

    public static void main(String[] args){
        int []arr= {1,3,5,4,7,6};
      /*  int low=0;
        int high=arr.length-1;
        int mid=high-(high-low)/2;
      mergeSort(arr, low, high);
      for(int i:arr)*/
      System.out.println(sumArray(arr, 0));
    }
}
