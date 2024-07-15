package Week1;
public class prime{


public static boolean primeNumber(int n){
for(int i=2;i<n;i++)
if(n%i==0)

  return false;
 return true;
}
public static void main(String[] args){
     int n=71;
     System.out.print(primeNumber(n));
        }
}

    

