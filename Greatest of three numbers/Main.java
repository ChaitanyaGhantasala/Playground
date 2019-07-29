import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s = new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int max;
      if((n1>n2)&&(n1>n3))
        max=n1;
      else if(n2>n3)
        max=n2;
      else 
        max=n3;
      System.out.println(max);
    }
}