import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
      int n = in.nextInt();
      int a = n;
      int b = 0;
      int sum = 0;
      
      while(a!=0)
      {
        b = a%10;
        int prod = 1;
        for(int i =1;i<=b;i++)
        {
          prod = prod*i;
        }
        sum = sum + prod;
        a = a/10;
      } 
      if(sum == n)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}