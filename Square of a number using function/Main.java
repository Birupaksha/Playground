import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sqar = squar(n);
      System.out.print(sqar);
      
	} 
  public static int squar(int n)
  {
    return n*n;
  }
}