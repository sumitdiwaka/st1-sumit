public class patternQ20 {
    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(i+j==n-2 || i-j==n-4 || j-i==n-4 || i==5 && j==6 || i==6 && j==5)
            System.out.print(" * ");
            else
            System.out.print("  ");
            }
            System.out.println();
        }
    }
    
}
