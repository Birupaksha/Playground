import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int product = 1;
      for(int i = 1;i <= n;i++)
      {
        product = product*i;
      }
      System.out.println(product);
	}
}