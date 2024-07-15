package Week1;

public class Arrays {
    public static void displayArrays(int[] arr){
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        int[]arr =new int[10];
        arr[1]=7;
        arr[2]=8;
        displayArrays(arr);
    }
}
 