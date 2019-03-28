import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = n;
      int b = n;
      int count = 0;
      while(a!=0)
      {
        a=a/10;
        count++;
      }
      int sum = 0;
      int temp = 1;
      
      while(n!=0)
      {
       temp=n%10;
        int temp1 = 1;
        for(int i=0;i<count;i++)
        {
          temp1 = temp1*temp;
        }
        sum = sum + temp1;
        n=n/10;
      }
      if(sum == b)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}