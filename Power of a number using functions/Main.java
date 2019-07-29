import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);
      int base = s.nextInt();
      int exponent = s.nextInt();
      int ans = power(base,exponent);
      System.out.println(ans);
    }
  public static int power(int base,int exponent)
  {
        int result = 1;
        while (exponent!=0)
        {
            result*=base;
            exponent--;
        }
    return result;
    }
}