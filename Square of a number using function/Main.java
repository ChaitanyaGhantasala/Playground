import java.util.Scanner;
class Main
{
  public static int square_of_num(int n)
  {
    int sqr = n*n;
    return sqr;
  }
	public static void main (String[] args)
    {
	 Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int sqr = square_of_num(n);
      System.out.println(sqr);
	} 
}