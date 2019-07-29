import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int k = s.nextInt();
      int arr[] = new int[k+1];
      for(int i=1;i<=k;i++)
      {
        arr[i]=0;
      }
      for(int i=1;i<=n;i++)
      {
        int temp = s.nextInt();
        arr[temp]++;
      }
      for(int i=1;i<=k;i++)
      {
        System.out.println(i+" "+arr[i]);
      }
    }
}