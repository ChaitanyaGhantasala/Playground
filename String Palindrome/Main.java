import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      String str = s.next();
      int length = str.length();
      int flag = 0;
      for(int i=0;i<(length)/2;i++)
      {
        if(str.charAt(i)!=str.charAt(length-i-1))
        {
          flag=1;
          break;
         }
       }
      if(flag==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}
