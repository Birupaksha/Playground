import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int len = sb.length();
      for(int i=0;i<26;i++)
      {
        char c = (char)('a'+i);
        boolean test = false;
        for(int j=0;j<len;j++)
        {
          if(sb.charAt(j)>='A'&&sb.charAt(j)<='Z')
          {
            int temp1 = sb.charAt(j)-'A';
            char ch1 = (char)('a'+temp1);
            sb.setCharAt(j,ch1);
          }
          if(c==sb.charAt(j))
          {
            test = true;
            break;
          }
        }
          if(test==false)
          {
            System.out.print(c+" ");
          }
        }
    }
}