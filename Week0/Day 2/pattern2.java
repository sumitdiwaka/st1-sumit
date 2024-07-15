/*import java.util.Scanner;

public class pattern2 {
    
     public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no n");
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1; k<=n-i;k++)
            System.out.println(" ");
            for(int j=1;j<=i;j++)
            System.out.print(" * ");
            System.out.println();
            

        

        }
    }
}
import java.util.*;
public class pattern2{
public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no n");
    n= sc.nextInt();
    for(int i=n;i>=1;i--){
        System.out.println(" ");
        for(int j=1;j<=i;j++)
        System.out.print(" * ");
        System.out.println();
    }
}
}*/
import java.util.*;
public class pattern2{

public static void main(String[] args) { 
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no n");
    n= sc .nextInt();
    for(int i=n;i>=1;i--){

        for(int k=1; k<=(n-i); k++)
        System.out.print("      ");
        for(int j=1;j<=i;j++)
        System.out.print(" * ");
        System.out.println();
    }
}
}




    

