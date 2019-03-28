import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt(); 
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      greatest(n1,n2,n3);
	}
  public static void greatest(int n1,int n2,int n3)
  {
    int a;
    if(n1>n2)
    {
      a=n1;
    }
    else
      a=n2;
    if(a>n3)
    {
      System.out.print(a);
    }
    else
    {
      System.out.print(n3);
    }
  }
}