import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int num=0;
      for(int cur_row=1;cur_row<=n;cur_row++)
      {
        for(int cur_col=1;cur_col<=cur_row;cur_col++)
        {
          System.out.print(cur_row);
          }
        System.out.println();
      }
    }
}