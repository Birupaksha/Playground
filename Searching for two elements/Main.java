import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[]=new int[n];
      for(int i =0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int element1=in.nextInt();
      int element2=in.nextInt();
      int element1_index=-1;
      int element2_index=-1;
      for(int i=0;i<n;i++)
      {
        if(element1==arr[i])
        {
          element1_index=i;
        }
        if(element2==arr[i])
        {
          element2_index=i;
        }
      }
      System.out.println(element1_index);
      System.out.println(element2_index);
      
    }
}