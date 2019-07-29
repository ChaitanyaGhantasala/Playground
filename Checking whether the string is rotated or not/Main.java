import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder temp = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        for(int i=0;i<=(sb1_len -1);i++){
            char ch = sb1.charAt(i);
            temp.append(ch);     
        }
        for(int i=0;i<=(sb1_len -1);i++){
            char ch = sb1.charAt(i);
            temp.append(ch);     
        }
        int temp_len = temp.length();
        int indx = substring_searching(temp, temp_len, sb2, sb2_len);
        if(indx != -1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    public static int substring_searching(StringBuilder str1, int str1_len, StringBuilder str2, int str2_len)
    {
        int matching_idx = -1;
        for (int i=0;i<(str1_len-str2_len + 1);i++)
        {
            int flag=0;
            for(int j=0;j<str2_len;j++)
            {
                if(str1.charAt(i+j)!=str2.charAt(j))
                {
                    flag=1;
                }
            }
            if(flag == 0)
            {
                matching_idx = i;
                break;
            }
        }
        return matching_idx;
    }
}
