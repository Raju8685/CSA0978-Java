import java.util.Scanner;
class yearmonthday
{
public static void main(String []agrs)
{
int n,year,month,day;
Scanner s = new Scanner(System.in);
System.out.println("Enter the days:");
n = s.nextInt();
year =n/365;
n=n%365;
System.out.println("No. of years:"+year);
month =n/7;
n=n%7;
System.out.println("No. of months:"+month);
day =n;
System.out.println("No. of days:"+day);
}
}