import java.util.Scanner;
class Account 
{
private double balance;
public Account(double initialBalance) 
{
this.balance = initialBalance;
}
public Account() 
{
this(0); 
}
public void deposit(double amount) 
{
this.balance += amount;
}
 public void withdraw(double amount) 
{
if (amount > this.balance)
 {
 System.out.println("Error: insufficient funds");
this.balance -= 5;
} 
else 
{
this.balance -= amount;
}
}
public double getBalance() 
{
return this.balance;
}
public void computeInterest(double rate) 
{
double interest = this.balance * rate / 100;
this.balance += interest;
}
}