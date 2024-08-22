import java.util.Scanner;
class Ternary
{
public static void main(String args[])
{
System.out.println("Enter the year");
Scanner sc= new Scanner(System.in);
int year=sc.nextInt();
String eligable=(year>=18)?"Major":"Minor";
System.out.println(eligable);
}}