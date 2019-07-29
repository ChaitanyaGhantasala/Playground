import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int Second_digit = 0;
      if(n<100)
      {
        Second_digit=n%10;
      }
      while(n>=100)
      {
        n=n/10;
        Second_digit = n%10;
      }
      System.out.println(Second_digit);
	}
}