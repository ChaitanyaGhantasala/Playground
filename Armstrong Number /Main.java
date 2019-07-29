import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int a=n,x,sum=0,count=0;
      while(n!=0)
      {
        n=n/10;
        count++;
      }
      n=a;
      while(n!=0)
      {
        x = n % 10;
        sum += Math.pow(x, count);
        n /= 10;
      }
      if(sum==a)
        	System.out.println("Armstrong Number");
      else 
        	System.out.println("Not a Armstrong Number");
	}
}