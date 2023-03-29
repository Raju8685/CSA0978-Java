import java.util.Scanner;
class Bank 
{
public double getRateOfInterest() 
{
return 0;
 }
 public double getRateOfInterest(int duration) 
{
return 0;
}
public double getRateOfInterest(String accountType) {
return 0;
}
}
class SBI extends Bank {
 public double getRateOfInterest() {
 return 7.5;
}
public double getRateOfInterest(int duration) {
if (duration < 1) {
 return 0;
} else if (duration < 5) {
return 7.5;
} 
else 
{
return 8.0;
}
}
}
class HDFC extends Bank {
public double getRateOfInterest() {
return 8.0;
}
public double getRateOfInterest(String accountType) {
if (accountType.equals("Savings")) {
 return 7.0;
} 
else 
{
return 8.5;
}
}
}

class ICICI extends Bank 
{
 public double getRateOfInterest() {
return 7.0;
 }
public double getRateOfInterest(int duration) {
if (duration < 1) {
 return 0;
} else if (duration < 3) {
return 7.0;
} 
else 
{
return 7.5;
}
}
}