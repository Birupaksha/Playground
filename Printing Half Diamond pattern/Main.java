import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=n;
      for(int i=0;i<n;i++)
      {
        for(int j=1;j<num;j++)
        {
          System.out.print(" ");
        }
        num--;
        for(int k=1;k<=2*i+1;k++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}