import java.util.Scanner;
class Numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n= sc.nextInt();
if(n%2==0)
{
System.out.println("the number "+n+" is even");
}
else
System.out.println("the number "+n+" is odd");
}
}