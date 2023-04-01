import java.util.Arrays;
import java.util.Scanner;
class alphabeticalreverseorder2
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the word:");
String word = sc.nextLine();
char[] arr = word.toCharArray();
Arrays.sort(arr);
for (int i = arr.length - 1; i >= 0; i--) 
{
System.out.print(arr[i] + " ");
}
}
}