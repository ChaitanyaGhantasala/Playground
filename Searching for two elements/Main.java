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
      int search_elem_1 = s.nextInt();
      int search_elem_2 = s.nextInt();
      int index1=-1,index2=-1;
      for(int i=0;i<arr_size;i++)
      {
        if(arr[i]==search_elem_1)
          	index1=i;
        if(arr[i]==search_elem_2)
          	index2=i;
      }
      System.out.println(index1);
      System.out.println(index2);
    }
}