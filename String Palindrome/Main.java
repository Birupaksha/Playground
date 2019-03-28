import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int fornt = 0;
      int end  = str_len-1;
      boolean is_palindram = true;
      while(fornt<end)
      { 
        if(str.charAt(fornt)!=str.charAt(end))
        {
          is_palindram = false;
          break;
        }
        fornt++;
        end--;
      }
      if(is_palindram==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}