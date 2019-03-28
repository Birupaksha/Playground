import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String str1 = in.nextLine();
      str = str.concat(str);
      if(str.contains(str1))
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
    }
}