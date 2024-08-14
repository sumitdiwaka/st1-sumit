package week2;

public class string {
    public static String sucessor(String s1) {
        String ans = "";
        for (int i = 0; i < s1.length(); i++) {
            ans += (char) (s1.charAt(i) + 1);
        }
        return ans;
    }

    // public static String reveString(String s1){
    // String ans ="";
    // for(int i=s1.length()-1;i>=0;i--){
    // ans+=s1.charAt(i);
    // }
    // return ans;
    // }
    public static boolean palindrome(String s1) {
        String ans = "";
        for (int i = 0; i < s1.length() - 1; i--)
            ans += s1.charAt(i);
        return (s1.equals(ans));
    }

    public static void reverseString(String s2) {
        s2 = s2.trim();

        String[] arr = s2.split(" ");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--)
            ans += arr[i]+" ";
        System.out.println(ans);
    }
    public static void particularsString(String s2){
        String ans = " ";

    }
    public static int longestSubstring(String s2){
        int max =0;
        int count =1;
        char curr=s2.charAt(0);
        for(int i=1;i<s2.length();i++){
            if(s2.charAt(i)== curr){
                count++;
            }
            else{
                curr =s2.charAt(i);
                max=Math.max(count,max);
                count=1;

            }
        }
                
           return max;
    }
    // very important question 
    public static void substring(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.println(s.substring(i, j));
            }
     }
    }

    public static void main(String[] args) {
       // String s4 = "abcde";
        substring("abcde");

    }
}
