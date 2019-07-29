import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int sum=0;
      int n1=n/100;
      int n2=n%10;
      sum=n1+n2;
      System.out.println(sum);
	}
}