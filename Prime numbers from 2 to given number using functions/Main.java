import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
        prime_num_n(n);
	}
    public static void prime_num_n(int n)
    {
      int i,j;
      for(i=1;i<=n;i++)
      {
        int count=0;
        for(j=1;j<=i;j++)
        {
          if(i%j==0)
            count++;
        }
        if(count==2)
          	System.out.println(i);
      }
    }
}