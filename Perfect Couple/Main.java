import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i] = in.nextInt();
      }
      int value = in.nextInt();
      couple(arr,n,value);
    }
  public static void couple(int arr[],int n,int value)
  {
    int match=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        match=arr[i]+arr[j];
        if(value==match)
        {
          System.out.println(arr[i]+", "+arr[j]);
        }
      }
    }
  }
}