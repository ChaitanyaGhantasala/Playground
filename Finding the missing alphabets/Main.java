import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int arr[] = new int[26]; 
        for(int i = 0; i < 26; i++){
            arr[i] = 0;
        }
        for(int i = 0; i < str_len; i++)
        {
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
            {
                arr[sb.charAt(i) - 'A']++;
            }
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
            {
                arr[sb.charAt(i) - 'a']++;
            }  
        }
        for(int i = 0; i <= 25; i++)
        {
            if(arr[i] == 0)
            {
                char missing_alphabet = (char)(i + 'a');
                System.out.print(missing_alphabet + " ");
            }
        }
    }
}
