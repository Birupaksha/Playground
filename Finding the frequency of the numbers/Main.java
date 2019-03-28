import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[n];
      for(int a=0;a<n;a++)
      {
        arr[a] = in.nextInt();
      }
      for(int i=1;i<=k;i++)
      {
        int count = 0;
        for(int j=0;j<n;j++)
        {
          if(i == arr[j])
          {
            count++;
          }
        }
        System.out.println(i+" "+count);
      }
    }
}