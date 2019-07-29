import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int arr_size = s.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        {
          arr[i] = s.nextInt();
        }
      int zero_count = 0;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]==0)
        	zero_count++;
      }
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]!=0)
        	System.out.print(arr[i]+" ");
      }
      for(int i=0;i<zero_count;i++)
      {
        System.out.print("0 ");
      }
    }
}
