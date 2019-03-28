import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in =new Scanner(System.in);
    int n = in.nextInt();
    System.out.println(facto(n));
  }
  
  public static int facto(int n)
  {
    if(n==0)
    {
      return 1;
    }
    return n*facto(n-1);
  }
}