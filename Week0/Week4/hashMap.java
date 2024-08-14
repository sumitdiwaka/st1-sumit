package Week4;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer>man= new HashMap<>();
        // moore 
        int[] arr ={2,2,1,1,2,2};
        int candi =0;
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(count ==0)
            candi=arr[i];
            if(arr[i]==candi)
            count++;
            else
            count--;
        }
        System.out.println(candi);
     /*   man.put(1,2);
        man.put(2,3);
        man.put(3,4);
        man.put(4,1);
        System.out.println(man);
        //arr[0]=2;
        //arr[1]=4;
        man.put(1,1);
        man.put(4,2);
        man.put(5,null);
        System.out.println(man.containsKey(3));
        System.out.println(man);
        man.remove(3);
        System.out.println(man);
        System.out.println(man.containsKey(3));
        System.out.println(man.get(4));
        // how to iterate a hashmap
        for(Map.Entry m : man.entrySet()){
            System.out.println("the key is : "+  m.getKey() +" " +"the value is : "+ m.getValue());
      
        // count no of 
        for(int i :arr){
            if(man.containsKey(i)){
                man.put(i,man.get(i)+1);
            }
            else{
                man.put(arr[i],1);
            }
        
        
        }
        for(int i=0;i<arr.length;i++){
            if(man.containsKey(arr[i])){
                man.put(arr[i],man.get(arr[i])+1);
            }
            else{
                man.put(arr[i],1);
            }
        }
        System.out.println(man);*/

    }
    }

