package Week1.day2;

public class swap {
    public static void swapNo(int a, int b ){
   int temp = a;
    a= b;
   b= temp;
   System.out.println("a = "+ a + "  b = "+ b);

    }
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        swapNo( a, b);
        
    }
    
}
