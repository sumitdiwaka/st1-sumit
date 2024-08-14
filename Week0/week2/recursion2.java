package week2;
public class recursion2 {
    public static void coinToss(int n , String ans){
        if(n==0){
            System.out.println(ans);
        }
        else{
            coinToss(n-1, ans+"H ");
            coinToss(n-1, ans+"T ");
        }
    }
    public static void generateSubsequences(String q, String ans){
        if(q.length()==0){
            System.out.println(ans);
            return;
        }
        else{
            generateSubsequences(q.substring(1), ans);
            generateSubsequences(q.substring(1), ans+q.charAt(0));
            
        }
    }
    public static int countGenerateSubsequences(String q){
        if(q.isEmpty())
        return 1;
        int num1 = countGenerateSubsequences(q.substring(1));
        int num2 = countGenerateSubsequences(q.substring(1));
        return num1+num2;
    }
    public static void GenerateValidParanthesis(int n,int left, int right,String ans){
     if(left==n&&left==right){
     System.out.println(ans);
        return;
     }
     if(left>n||right>left){
        return;
     }
        GenerateValidParanthesis(n, left+1, right, ans+"{");
        GenerateValidParanthesis(n, left, right+1, ans+"}");
 }
 public static void towerHanoi(int n,char a,char b,char c){
    if(n==1){
        System.out.println(a+"->"+c);
        return;
 }
    towerHanoi(n-1, a,c,b);
    System.out.println(a+"->"+c);
    towerHanoi(n-1, b,a,c);
 }
  public static void main(String[] args) {
      towerHanoi(5,'A','B','C');
    }
}

