public class patternQ33 {
    public static void main(String[] args) {
        int n=10;
        for(int i=1; i<=n; i++){
            int count=n-i+1;
            for(int k=1;k<=(n-i);k++)
            System.out.print("  ");
            for(int j=1; j>=i;j-- ){
            if(count==10)
            System.out.print("0 ");
            else
            System.out.print(count+" ");
            count++;
            }
        for(int j1=2;j1<=i-1;j1++){
            count--;
            System.out.print(count+"");
        }
        System.out.println();

    }
    }
    
}
