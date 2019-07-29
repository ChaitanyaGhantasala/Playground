import java.util.Scanner;
class Main
{
  public static int sum_of_num(int n)
  {
    int sum = (n*(n+1))/2;
    return sum;
  }
	public static void main (String[] args)
    {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int sum = sum_of_num(n);
      System.out.println(sum);
    }
}