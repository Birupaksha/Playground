import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    int str1_len = str1.length();
    int str2_len = str2.length();
    
    int count = 1;
    for(int i=0;i<(str1_len-str2_len);i++)
    {
      boolean is_match = true;
      for(int j=0;j<(str2_len-1);j++)
      {
        if(str1.charAt(i+j)!=str2.charAt(j))
        {
          is_match = false;
          break;
        }
      }
      if(is_match)
      {
        count++;
      }
    }
    System.out.println(count);
  } 
}