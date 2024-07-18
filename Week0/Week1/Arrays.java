package Week1;

public class Arrays {
    public static void displayArrays(int[] adii){
        for(int i=0;i<adii.length;i++)
        System.out.print(adii[i]+" ");
    }
    public static void main(String[] args) {
        int[]arr =new int[10];
        arr[1]=7;
        arr[2]=8;
        displayArrays(arr);
    }
}
 