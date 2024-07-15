public class patternQ25 {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");
            for(int j1=1;j1<=i;j1++,count++)
            System.out.print(""+count+" ");
            for(int j2=1;j2<=i-1;j2++,count++
            )
            System.out.print(""+count+" " );
             System.out.println();
        }
    
}
}