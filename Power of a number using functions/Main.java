import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      power(base,exponent);
	}
  public static void power(int base,int power)
  {
    int result=1;
    for(int i=1;i<=power;i++)
    {
      result = result*base;
    }
    System.out.print(result);
  }
}