import java.util.Scanner;
class CharacterPattern 
{
 public static void main(String[] args) 
{
 Scanner input = new Scanner(System.in);
 System.out.print("Enter the character to be printed: ");
 char ch = input.next().charAt(0);
 System.out.print("Enter the maximum number of times to be printed: ");
 int max = input.nextInt();
 input.close();
 for (int i = 1; i <= max; i++)
 {
  for (int j = 1; j <= i; j++)
 {
  System.out.print(ch + " ");
}
System.out.println();
}
}
}