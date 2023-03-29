import java.util.Scanner;
class matrixaddition1
{
public static void main(String [] args)
{
int[][] mat1={{7,2,5},{2,3,6},{4,6,8}};
int[][] mat2={{2,2,3},{3,3,2},{1,3,1}};
int row=mat1.length;
int col=mat2.length;
 int[][] matSum = new int[row][col];
 for(int i=0; i<row; i++)
{
 for(int j=0; j<col; j++) 
{
matSum[i][j] = mat1[i][j] + mat2[i][j];
 }
}
System.out.println("Matrix addition result:");
 for(int i=0; i<row; i++)
 {
for(int j=0; j<col; j++) 
{
 System.out.print(matSum[i][j] + " ");
}
System.out.println("   ");
}
}
}