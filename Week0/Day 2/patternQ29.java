public class patternQ29 {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");
            for(int j1=1;j1<=i;j1++)
            if( (i+j1)==(i+1)){
            System.out.print(count+" ");
            count++;
            }
            else
            System.out.print("0 ");
           for(int j2=1;j2<=i-1;j2++)
           if(j2==(i-1)){
            System.out.print((count-1)+" ");
           }
           else
           System.out.print("0 ");
             System.out.println();
        }
}
}