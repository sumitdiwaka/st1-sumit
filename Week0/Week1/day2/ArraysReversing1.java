package Week1.day2;
 

public class ArraysReversing1 {
   //
 public static void reverseArray1(int []array1,int i,int j){
       i=0; 
       j = array1.length-1;
     while (i>j){
     change(array1,i,j);}
}
    public static void  change(int [] adii , int i, int j){
        int temp = adii[i];
        adii[i]=adii[j];
        adii[j]=temp;

    }
    public static void printArray(int [ ] arr){
          for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+" ");
       }

    public static void main(String[] args) {
        int [] arr1  = { 4 , 5, 7 ,78,9,66, 45};

       
       reverseArray1(arr1,2,3);
       
    
        printArray(arr1);
    }

    
}
