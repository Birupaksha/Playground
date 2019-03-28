import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in = new Scanner(System.in);
    int rs = in.nextInt();
    int cs = in.nextInt();
    int matrix[][] = new int[rs][cs];
    int trans[][] = new int[cs][rs];
    for(int i=0;i<rs;i++)
    {
      for(int j=0;j<cs;j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
     for(int i=0;i<cs;i++)
    {
      for(int j=0;j<rs;j++)
      {
        trans[i][j] = matrix[j][i];
      }
    }
     for(int i=0;i<rs;i++)
    {
      for(int j=0;j<cs;j++)
      {
        System.out.print(matrix[i][j]+" ");
      }
       System.out.println();
    }
  }
}