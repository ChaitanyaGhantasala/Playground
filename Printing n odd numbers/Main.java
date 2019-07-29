import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	  Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int a=0;
      for(int i=1;;i++)
      {
        if(i%2==1)
        {
          	System.out.println(i);
            a++;
        }
        if(a==n)
          	break;
      }
	}
}