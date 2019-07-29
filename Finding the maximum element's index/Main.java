import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int arr_size = s.nextInt();
    int arr[] = new int[arr_size];
    int index=0,max_element=0;
    for(int i=0;i<arr_size;i++)
      {
        arr[i] = s.nextInt();
      }
    for(int i=0;i<arr_size;i++)
      {
        if(arr[i]>max_element)
        {
          max_element = arr[i];
          index = i;
        }
      }
    System.out.println(index);
  }
}
