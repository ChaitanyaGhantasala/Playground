import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int sum=0,prod=1,x=n,a,b;
      while(n>0)
      {
        a=n%10;
        n=n/10;
        for(int i=a;i>=1;i--)
        {
          prod=prod*i;
        }
        sum=sum+prod;
        prod=1;
      }
      if(sum==x)
        System.out.println("Yes");
      else 
        System.out.println("No");
	}
}