import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a[]= new int[n];
    int max=0,res=0;
    for(int i=0;i<n;i++)
    {
      a[i] = s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      int count=0;
      for(int j=i;j<n;j++)
      {
        if(a[i]==a[j])
          count++;
      }
      if(count>max)
      {
        res = a[i];
        max=count;
      }
    }
    System.out.println(res);
  }
}