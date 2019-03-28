import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int a = 1;
      while(n!=0)
      {
        if(a%2==1)
        {
          System.out.println(a);
          n--;
        }
        a++;
      }
	}
}