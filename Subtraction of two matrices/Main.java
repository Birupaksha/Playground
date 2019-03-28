import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int rs = in.nextInt();
    int cs = in.nextInt();
    int arr1[][]= new int[rs][cs];
    int arr2[][]= new int[rs][cs];
    for(int i=0;i<rs;i++)
    {
      for(int j=0;j<cs;j++)
      {
        arr1[i][j] = in.nextInt();
      }
    }
     for(int i=0;i<rs;i++)
    {
      for(int j=0;j<cs;j++)
      {
        arr2[i][j] = in.nextInt();
      }
    }
    int sub[][] = new int[rs][cs];
     for(int i=0;i<rs;i++)
    {
      for(int j=0;j<cs;j++)
      {
        sub[i][j] = arr1[i][j]-arr2[i][j];
      }
    }
     for(int i=0;i<rs;i++)
    {
      for(int j=0;j<cs;j++)
      {
        System.out.print(sub[i][j]+" ");
      }
       System.out.println();
    }
  }
}