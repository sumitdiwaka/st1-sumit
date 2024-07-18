package Week1.day2;

public class traversing {
    public static int traversingArray(int []arr, int x ){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
        return i;
        }
    }
        return -1;
    }
        public static void main(String[] args) {
    int[]arr =new int[10];
    arr[1]=7;
    arr[2]=8;
    arr[3]=11;
    int x = 11;
    System.out.println( traversingArray(arr, x));
}
}

    


