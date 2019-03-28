import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = n;
      int count=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<num;j++)
          System.out.print(" ");
        num--;
        for(int k=1;k<=i;k++)
        {
          System.out.print(count+++" ");
        }
        System.out.println();
      }
    }    
}