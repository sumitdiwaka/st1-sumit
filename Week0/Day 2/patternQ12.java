public class patternQ12 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1; k<=(n-i);k++)
            System.out.print("  ");
            for(int j1=1;j1<=i;j1++)
            if(j1%2==0)
            System.out.print("! ");
            else
            System.out.print("* ");
            for(int j2=1;j2<=i-1;j2++)
            if((i+j2)%2 == 0)
            System.out.print("! ");
            else
            System.out.print("* ");
            System.out.println();
        }
    }
}

