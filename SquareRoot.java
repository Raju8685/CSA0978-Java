import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sc.nextInt();

// Check if the number is a perfect square
int sqrt = (int) Math.sqrt(num);
if (sqrt * sqrt == num) {
System.out.println("The square root of " + num + " is " + sqrt + " and -" + sqrt);
} else {
System.out.println(num + " is not a perfect square");
}

sc.close();
}
}