import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int greatest=arr[0];
      for(int i=0;i<n-1;i++)
      {
        if(arr[i+1]>greatest)
        {
          greatest=arr[i+1];
        }
      }
      System.out.print(greatest);
    }
}