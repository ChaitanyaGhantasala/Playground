import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      switch(n)
      {
        case 1:
          int side = s.nextInt();
          System.out.println(side*side);
          break;
        case 2:
          int len = s.nextInt();
          int bre = s.nextInt();
          System.out.println(len*bre);
          break;
        case 3:
          int base = s.nextInt();
          int height = s.nextInt();
          System.out.println(base*height*0.5);
          break;
        case 4:
          int r = s.nextInt();
          System.out.println(3.14*r*r);
          break;
        default:
          break;
      }
    }
}
