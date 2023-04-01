import java.util.Scanner;

public class SingleDigitSum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter N value: ");
int n = sc.nextInt();

System.out.print("Enter " + n + " digit number: ");
int num = sc.nextInt();

int sum = 0;

// Compute the sum of digits of the given number
while (num > 0) {
int digit = num % 10;
sum += digit;
num /= 10;
}

// If the sum is greater than 9, compute the sum of digits again
while (sum > 9) {
int temp = sum;
sum = 0;
while (temp > 0) {
int digit = temp % 10;
sum += digit;
temp /= 10;
}
}

System.out.println("The single digit sum is: " + sum);

sc.close();
}
}