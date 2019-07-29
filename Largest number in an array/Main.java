import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int arr_size = s.nextInt();
      int arr[] = new int[arr_size];
      int max=0;
      for(int i=0;i<arr_size;i++)
      {
        arr[i] = s.nextInt();
      }
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i] > max)
        	max = arr[i];
      }
      System.out.println(max);
    }
}