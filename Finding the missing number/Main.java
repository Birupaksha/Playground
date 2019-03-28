import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr [] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = in.nextInt();
      }
      int count ;
      for(int i=1;i<=n;i++)
      {
        count = 0;
        for(int j=0;j<n;j++)
        {
         if(i==arr[j])
         {
           count = 1;
         }
        }
        if(count == 0)
        {
          System.out.println(i);
        }
      }
    }
}