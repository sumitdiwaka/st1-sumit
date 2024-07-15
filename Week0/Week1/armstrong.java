package Week1;

public class armstrong {
    public static int countDigits (int n){
   int  numberOfDigits=0;
   while(n!=0){
   n/=10;
   numberOfDigits++;
   }
   return numberOfDigits;
}
public static boolean  checkArm(int n){
    int temp=n;
int d = countDigits(n);
int sum=0;
while(n!=0){
    sum+=Math.pow((n%10),10);
    n/=10;
}

return (sum==n);
}
public static void main(String[] args){
    int n=7;
    System.out.print(countDigits(n));
    System.out.println(checkArm(n));
       }

}