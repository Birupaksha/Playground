import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int len = sb.length();
      
      for(int i=0;i<len;i++)
      {
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z'||sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
        {
        int count = 0;
        int a;
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
          {
            a = sb.charAt(i)-'a';
        }
        else
        {
          a = sb.charAt(i)-'A';
        }
        for(int j=0;j<len;j++)
        {
          int c = sb.charAt(j)-'a';
          int c1 = sb.charAt(j)-'A';
          if(a==c || a==c1)
          {
            sb.setCharAt(j,'$');
            count++;
          }
        }
        char m = (char)('a'+a);
        System.out.print(m+""+count+" ");
        }
      }
            
    }
}