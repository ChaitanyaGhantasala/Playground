import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		// Type your code here
      int year = s.nextInt();
      if((year%4==0)||(year%100==0))
      {
        if(year%400==0)
          System.out.println("Leap year");
        else 
          System.out.println("Non Leap year");
    }
    }
}