import java.util.Scanner;
class exception
{
public static void main(String [] args)
{
try
{
String s = "saveetha school of engineering";
String s1 = "";
s1 = s.replaceAll("[aeiou]", ""); 
System.out.println("String after removing vowel : "+s1);
}
catch (Exception e)
{
 System.out.print("Invalid");
}
}
}