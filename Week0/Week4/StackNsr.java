package Week4;

import java.util.*;

public class StackNsr {
    static int[] nextSmallestRight(int[] arr){
        int[] ngr = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = arr.length-1 ; i >= 0 ; i--){
            while (!stk.empty() && arr[i] < stk.peek()) 
                stk.pop();
                if(stk.empty())
                    ngr[i] = -1;
                else 
                    ngr[i] = stk.peek();
                stk.push(arr[i]);
        }
        return ngr;
    }
    public static void main(String[] args) {
        int[] arr = {7,3,4,5,9,2};
        int[] nums = nextSmallestRight(arr);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}


