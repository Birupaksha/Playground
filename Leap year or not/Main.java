import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		
		// Type your code here
      Scanner in = new Scanner(System.in);
      int year = in.nextInt();
      if(year%4==0)
      {
        if(year%100==0)
        {
          if(year%400==0)
          {
            System.out.println("Leap year");
          }
          else
             System.out.println("Non Leap year");
        }
        else
           System.out.println("Leap year");
      }
      else
         System.out.println("Non Leap year");
    }
}