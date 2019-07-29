import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int arr_size = s.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i] = s.nextInt();
      }
      int flag = 0; 
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]!=arr[arr_size-i-1])
        {
          flag = 1;
          break;
        }
      }
      if(flag==0)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}