import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int First_digit = 0;
      int Last_digit = n%10;
      while(n>=10)
      {
        n=n/10;
        First_digit = n;
      }
      int sum = First_digit + Last_digit;
      System.out.println(sum);
	}
}