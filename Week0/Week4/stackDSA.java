package Week4;

import java.util.*;

public class stackDSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> ngr = new Stack<>();
         stk.push(1);
         stk.push(2);
         stk.push(10);
         stk.push(20);
         stk.push(100);
         stk.push(200);
         System.out.println(stk.size()-stk.search(100));
        // System.out.println(stk.search(200));
        // System.out.println(stk.peek());
        // System.out.println(stk.pop());
        // System.out.println(stk.peek());
        // System.out.println("enter the no of element");
        
          int n = sc.nextInt();
         for(int i=0;i<n;i++){
            System.out.println("enter the element");
          int a =sc.nextInt();
         stk.push(a);
         }
         System.out.println(stk);
          /*  while (sc.hasNextInt()) {
            stk.push(sc.nextInt());

        }
        System.out.println(stk);
        while (!stk.empty()) {
          System.out.println(  stk.pop());
         }
         System.out.println(stk);*/
    }
}
