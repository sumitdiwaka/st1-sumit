package Week1;

public class reverse {
    public static int reverseInteger(int n){
        int temp=0;
        while(n!=0)
        temp=temp*10+n%10;
        n/=10;
        return temp;
    }
    public static void main(String[] args){
        int n=34567;
        System.out.print(reverseInteger(n));
           }
    
}
