import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      int c = s.nextInt();
      int res1 = gcd(a,b);
      int res2 = gcd(res1,c);
      System.out.println(res2);
	}
  	
  	public static int gcd(int x, int y)
    {
      int min;
      if(x>y)
        min=y;
      else
        min=x;
      while(min>=1)
      {
        if(x%min==0&&y%min==0)
        {
          return min;
        }
        min--;
      }
      return 0;
    }
}