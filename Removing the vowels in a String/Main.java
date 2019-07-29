import java.util.Scanner;

public class Main
{
   public static void main(String args[])
   {
       String str;
       Scanner s = new Scanner(System.in);
       str = s.nextLine();
       String r = "";
      for(int i=0; i<str.length(); i++)
       {
         if (!isVowel(Character.toLowerCase(str.charAt(i))))
         {
           r = r+str.charAt(i);
         }
       }
       System.out.print(r);
   }
   public static boolean isVowel(char c)
   {
     String vowels = "aeiou";
     int i;
     for(i=0;i<5; i++)
     {
       if(c == vowels.charAt(i))
       {
         return true;
       }
     }
     return false;
   }
}