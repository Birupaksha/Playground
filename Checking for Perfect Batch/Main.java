import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int a=n/2;
    int sum1=0,sum2=0;
    if(n%2==0)
    {
    for(int i=0;i<a;i++)
    {
     sum1=sum1+arr[i];
    }
    for(int i=a;i<n;i++)
    {
     sum2=sum2+arr[i];
    }
    }
    else
    {
       for(int i=0;i<a;i++)
    {
     sum1=sum1+arr[i];
    }
    for(int i=a+1;i<n;i++)
    {
     sum2=sum2+arr[i];
    }
    }
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}