package Week1.Week4;

public class recursion {
    static void print(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static int sumHead(int n){
        if(n==1)
        return 1;
        return n+sumHead(n-1);
    }
    public static int sum(int n, int a){
        if(n==1)
        return a+n;
        return sum(n-1,a+n);
    }
    public static int count(int n){
        if(n==1)
        return 0;
        if(n%2==0)
        return 1+count(n-1);
        else
        return 0+count(n-1);
    }
    public static int powerF(int base ,int power){
        if(power==0)
        return 1;
       return base*powerF(base,power-1);
    }
    public static int powerfT(int base,int power,int ans){
        if(power==0){
            return ans;
        }
        return powerfT(base, power-1, ans*base);
    }
    public static int factorial(int n){
        if(n==1 || n==0)
        return 1;
        return n*factorial(n-1);
    }
    static int factorialTail(int n, int ans){
        if(n==1 || n==0)
        return ans;
        return factorialTail(n-1,n*ans);

    }
    public static int fbSeries(int n ){
        if(n==0 || n==1)
        return n;
        return fbSeries(n-1)+fbSeries(n-2);
    }
    public static int fbSeriesTail(int n, int ans){
        if(n==0||n==1)
        return n;
        return fbSeriesTail(n, ans+n);
    }
    public static void main(String[] args) {
        System.out.println(fbSeries(7));
    }
}
