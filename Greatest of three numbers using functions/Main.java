import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner s = new Scanner(System.in);
      int n1 = s.nextInt();
      int n2 = s.nextInt();
      int n3 = s.nextInt();
      int max1 = find_max(n1,n2);
      if(max1>n3)
        	System.out.println(max1);
      else
        	System.out.println(n3);
 	}
  
    public static int find_max(int n1,int n2)
    {
      int max;
      if(n1>n2)
        max=n1;
      else 
        max=n2;
      return max;
    }
}