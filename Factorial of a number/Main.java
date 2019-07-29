import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int prod=1;
      Scanner s = new Scanner(System.in);
      int n= s.nextInt();
      for(int i=1;i<=n;i++)
      {
        prod=prod*i;
      }
      System.out.println(prod);
	}
}