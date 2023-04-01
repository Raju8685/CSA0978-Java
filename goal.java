
import java.util.Scanner;
public class goal
{
public static void main(String[] args)
{
String s1 = "abcde";
String goal1 = "cdeab";
boolean result1 = canShiftToGoal(s1, goal1);
System.out.println(result1); 
String s2 = "abcde";
String goal2 = "abced";
boolean result2 = canShiftToGoal(s2, goal2);
System.out.println(result2); 
}
}