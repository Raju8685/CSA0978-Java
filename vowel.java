import java.util.Scanner;
class vowel 
{
public static void main(String[] args)
 {
String s = "saveetha school of engineering";
String s1 = "";
s1 = s.replaceAll("[aeiou]", ""); 
System.out.println("String after removing vowel : "+s1); 
}
}