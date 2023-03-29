import java.util.Scanner;
class consonants 
{
public static void main(String[] args)
 {
Scanner Scanner= new Scanner(System.in);
System.out.print("Enter a string: ");
String inputString = Scanner.nextLine();
String result = inputString.replaceAll("[^aeiouAEIOU]", "");
System.out.println("Result: " + result);
}
}