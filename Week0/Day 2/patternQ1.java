// square print 
import java.util.*;

public class patternQ1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no n");
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            System.out.print(" * ");
            System.out.println();
        }
    }
    
}
 