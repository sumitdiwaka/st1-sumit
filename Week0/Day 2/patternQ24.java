public class patternQ24 {

    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");
            for(int j1=1;j1<=i;j1++)
            System.out.print(i+" ");
            for(int j2=1;j2<=i-1;j2++)
            System.out.print(i+" " );
             System.out.println();
        }
}
}