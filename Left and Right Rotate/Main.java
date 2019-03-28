import java.util.Scanner;
class Main 
{
  public static void right_rot_odd(int arr[],int n,int rot)
  {
    int first_odd_index =0;
    int last_odd_index;
    int temp;
    if(n%2==0)
    {
      last_odd_index=n-2;
    }
    else
    {
      last_odd_index=n-1;
    }
    for(int i=1;i<=rot;i++)
    {
      temp=arr[last_odd_index];
      for(int j=last_odd_index;j>0;j=j-2)
      {
        arr[j]=arr[j-2];
      }
      arr[first_odd_index]=temp;
    }
  }
  
  public static void left_rot_even(int arr[],int n,int rot)
  {
    int first_even_index =1;
    int last_even_index;
    int temp;
    if(n%2==0)
    {
      last_even_index=n-1;
    }
    else
    {
      last_even_index=n-2;
    }
    for(int i=1;i<=rot;i++)
    {
      temp=arr[first_even_index];
      for(int j=3;j<n;j=j+2)
      {
        arr[j-2]=arr[j];
      }
      arr[last_even_index]=temp;
    }
  }
        
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = in.nextInt();
    }
    int rot = in.nextInt();
    right_rot_odd(arr,n,rot);
    left_rot_even(arr,n,rot);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  	}
}