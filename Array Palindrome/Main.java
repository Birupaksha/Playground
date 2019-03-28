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
      int r=arr[0],l=arr[n-1];
      for(int i=1;i<n;i++)
      {
        r = (r*10)+arr[i];
      }
      for(int i=n-2;i>=0;i--)
      {
        l = (l*10)+arr[i];
      }
      if(r==l)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
       
      
    }
}