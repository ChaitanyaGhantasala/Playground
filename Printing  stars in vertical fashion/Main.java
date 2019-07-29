import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int starcount;
    for(starcount=1;starcount<=n;starcount++)
    {
      System.out.println("*");
    }
  }
}