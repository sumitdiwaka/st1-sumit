package Week1;

import java.util.Scanner;

public class main {
  /*   public static int countDigits (int n, int k){
        int  numberOfDigits=0;
        while(n!=0){
			int rem = n%10;
        if(rem==k){
        numberOfDigits++;
		}
		n/=10;
        }

        return numberOfDigits;
    }
     public static void main(String[] args) {
        int n = 22222345;
      System.out.println(countDigits(n,2));
        
     }
} 
	public static void primeNumber(int n){
         for(int i=1;i<=n;i++){
            if( n==1){
         System.out.print("not prime");}
           else if(n%i+1==0){
			     System.out.print( "prime");}
           else{
            System.out.println(" invald input");
           }
        }
	}

    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		primeNumber(n);
     }
    }
}
public static int conversionBd(int n){
  int sum =0;
  int  count =0;
  while(n!=0){
    int rem = n%10;
    sum+=rem*(Math.pow(2,count));
    n/=10;
    count++;
 }
return sum;
}
public static int gcd(int n1,int n2){
  int temp =0;
 for(int i = 1;i<n2;i++){
  if(n1 % i==0 && n2 % i == 0 ){
   int temp1= i;
   temp=Math.max(temp1,temp);
  }
 }
 return temp;
}
public static int countDigits (int i){
  int  j=0;
  while(i!=0){
  i/=10;
  j++;
  }
  return j;

}
public static int  checkArm(int i){
int temp= i;
int d = countDigits(i);
int sum=0;
while(i!=0){
   sum+=Math.pow((i%10),d);
   i/=10;
}
if(sum==temp);
 return temp;
}

public static void checkRun(int N,int n){
  for(int i=1;i<=n;i++){
  int sumE =0;
  int sumO =0;
  while (n!=0) {
    int rem = n%10;
    if(rem%2==0){
    sumE+=rem;
    n/=10;
   }
  else{
    sumO+=rem;
    n/=10;
  }
  }
  if(sumE %4==0 || sumO%3==0){
  System.out.println("yes");
  }else{
  System.out.println("no");
  }
}
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no");
    int N = sc.nextInt();
    int n = sc.nextInt();
    //System.out.println("enter the 2nd no");
   // int n2 = sc.nextInt();
   // for(int i = n1; i<n2;i++){
   //  System.out.println(checkArm(i));
     checkRun(N,n);
}
}
public static int lcm(int n1,int n2){
  int temp=Integer.MAX_VALUE;
 for(int i = n1;i<(n1*n2);i++){
  if(i%n1 ==0 && i%n2 == 0 ){
   int temp1= i;
   temp=Math.min(temp1,temp);
  }
 }
 return temp;
}public static int fibonacciSeries(int n){
  int sum =0;
  int b=1;
  for(int i =1;i<=n;i++){
    sum +=b;
    int c =sum;
    sum=b;
    b=c;
  }
  return sum;
}
public static int countDigits (int n1){
  int  numberOfDigits=0;
  while(n1!=0){
  n1/=10;
  numberOfDigits++;
  }
  return numberOfDigits;
}
public static void sumEoPlaces(int n1){
  int d = countDigits(n1);
  int sumE =0;
  int sumO=0;
  if(d%2==0){
    while(d!=0){
      if(d%2!=0){
        sumE += n1%10;
        n1/=10;
       d--;
      }
      else{
        sumO+=n1%10;
        n1/=10;
        d--;
      }

    }
  }
  else{
    while(d!=0);{
      if(d%2!=0){
        sumO+= n1%10;
        n1/=10;
        d--; 
      }
      else{
        sumE+=n1%10;
        n1/=10;
        d--;
      }

    }
  }
  System.out.println("sum even  "+ sumE);
  System.out.println("sum odd  "+ sumO);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no");
    int n1 = sc.nextInt();
    //int n2 = sc.nextInt();
   // int n3 = sc.nextInt();
    countDigits ( n1);
    sumEoPlaces(n1);
}
}
public static int countDigits (int n1){
  int  numberOfDigits=0;
  while(n1!=0){
  n1/=10;
  numberOfDigits++;
  }
  return numberOfDigits;
}
public static void sumEoPlaces(int n1){
  int d = 1;
  int sumE =0;
  int sumO=0;
    while(n1!=0){
      if(d%2==0){
        sumE += n1%10;
      }
      else{
        sumO+=n1%10;
	  }
        n1/=10;
        d++;
	
      }
   System.out.println("sum even  "+ sumO);
  System.out.println("sum odd  "+ sumE);
}
public static void primeNumber(int n){
  for(int i=2;i<n;i++)
     if(n%i==0){
  System.out.println( "Not Prime" );
 }
else{
 System.out.println("Prime");
}

}
// faraheenit
public static void conversionFc(int min,int max,int step){
for(int j =min;j<=max;j+=step){
long c= (5*(j-32))/9;
System.out.println(j + " " + c);
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int min  = sc.nextInt();
    int max= sc.nextInt();
    int step = sc.nextInt();
     conversionFc(min,max,step);
   }
}
public static int countDigits (int n){
  int  numberOfDigits=0;
  while(n!=0){
  n/=10;
  numberOfDigits++;
  }
  return numberOfDigits;
}
public static int boston(int n) {
int sum = 0;
 int sum1 = 0;
  int sum2=0;
  int sum3=0;
   while(n!=1){
  for(int i=2;i<=n;i++){
    while(n%i==0){
      sum+=i;
     n/=i;
    }
  }
 }
 while (sum!=0) {
  int rem1 = sum%10;
   sum2 +=rem1;
   sum/=10;
 }
while (n!=0) {
   int rem =n%10;
  sum1+=rem;
  n/=10;
}
while (sum1!=0) {
  int rem1 = sum%10;
   sum3 +=rem1;
   sum1/=10;
 }
if(sum2==sum3)
return 0;
return 1;
}
public static void winner(int N,int M){
int current =1;
  int pA= 0;
  int pH=0;
  while (pA <=N && pH<=M) {
    pA+=current;
    current++;
    pH+=current;
    current++;
  
  if(pH>M){
    System.out.println(" harshit");
    return;
  }
  else {
    System.out.println("aayush");
    return;
  }
}
}*/

public static void conversionAny(int sb,int db , int sn){
  if(sb==2||sb==8 && db==10){
    int ans=0;
    int  count =0;
    while(sn!=0){
      int rem = sn%10;
      ans+=rem*(Math.pow(sb,count));
      sn/=10;
      count++;
  }
  System.out.println(ans);
}
else if(db==2 || db==8 && sb==10){
  int ans=0;
  int  count =0;
  while(sn!=0){
    int rem = sn%10;
    ans+=rem*(Math.pow(sb,count));
    sn/=10;
    count++;
}
   int  an=0;
    int mult=1;
    while(ans!= 0){
             int rem =ans % db;
            an  = an + rem * mult;
            mult = mult * 10;
            ans= ans/ db;    
        }  
        System.out.println(an);
      }

}
/* 
public static void print(int n1,int n2){

  int n=1;int count=1;
 while(count<=n1){

     int ans=3*n+2;
     if(ans%n2!=0){
         System.out.println(ans);
         count++;

     }                
     n++;
   }
}*/

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
 // int n1 = sc.nextInt();
  //int n2 = sc.nextInt();
   int sb = sc.nextInt();
   int db = sc.nextInt();
   int sn = sc.nextInt();
  conversionAny(sb, db, sn);
 }
}

