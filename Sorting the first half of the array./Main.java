import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int list[] = new int[n];
        for(int i=0;i<n;i++)
        {
            list[i]=s.nextInt();   
        }
        insertion_sort(n,list);
    }    
    public static void insertion_sort(int n,int list[])
    {
        for(int i=1;i<n/2;i++) 
        {
            int key = list[i];
            int j = i-1;
            while((j>=0)&&(list[j]>key)) 
            {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(list[i]+" ");
        }
        
    }
}