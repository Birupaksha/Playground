import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      prime1(n);
	}
  public static void prime1(int n)
  {
    int a;
    for(int i=1;i<=n;i++)
    {
      a=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          a++;
        }
      }
      if(a==2)
      {
        System.out.println(i);
      }
    }
  }
}