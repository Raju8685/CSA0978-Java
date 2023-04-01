import java.util.Scanner;
class voteeligible
{
public static void main(String [] agrs)
{
int age,diff;
Scanner a =new Scanner (System.in);
System.out.println("Please Enter the age :");
age = a.nextInt();
if(age>=18)
{
System.out.println("you are eligible for vote");
}
else
{
diff = ( 18- age);
System.out.println("you are not eligible for vote");
System.out.println("you can wait :"+diff+"year");
}
}
}

