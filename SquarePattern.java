import java.util.Scanner;
class SquarePattern
 {
    public static void main(String[] args) 
{
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the symbol to be printed: ");
 char symbol = input.next().charAt(0);
 System.out.print("Enter the size of the square: ");
  int size = input.nextInt();
  input.close();
   for (int i = 1; i <= size; i++) {
  for (int j = 1; j <= size; j++) {
  if (i == 1 || i == size || j == 1 || j == size || i == j || j == size-i+1) {
         System.out.print(symbol + " ");
 }
 else 
{
 System.out.print("  ");
 }
 }
 System.out.println();
 }
 }
}