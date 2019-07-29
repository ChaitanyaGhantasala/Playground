import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int arr_size = s.nextInt();
      int arr[] = new int[arr_size];
      int temp;
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=0;
      }
      for(int i=0;i<arr_size;i++)
      {
        temp = s.nextInt();
        arr[temp-1]++;
      }
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]==0)
        {
          System.out.println(i+1);
          break;
        }
      }
    }
}