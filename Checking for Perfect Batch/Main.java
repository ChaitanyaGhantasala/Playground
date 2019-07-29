import java.util.Scanner;
class Main
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int arr_size = sc.nextInt();
		int arr[] = new int[arr_size];
		for(int index = 0; index < arr_size; index++)
		{
			arr[index] = sc.nextInt();
		}
		perfect_batch(arr, arr_size);
	}

	public static void perfect_batch(int list[], int n)
	{
		int flag = 0;
		int batch_sum = list[0] + list[1] + list[2];
		for(int index = 3; index <= n-1 ; index = index + 3)
		{
			int curr_batch_sum = list[index] + list[index + 1] + list[index + 2];
			if(curr_batch_sum != batch_sum)
			{
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("Perfect Batch");
		}
		else
		{
			System.out.println("Not a Perfect Batch");
		}
	}
}