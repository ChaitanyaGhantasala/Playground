import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      int i,j;
      for(i=0;i<n;i++)
      {
        arr[i] = s.nextInt();
      }
      for(i=0;i<n;i++)
      {
        for(j=i+1;j<n;j++)
        {
          if(arr[i]>arr[j])
          {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
      int k = s.nextInt();
      System.out.println(arr[n-k]);
    }   
}