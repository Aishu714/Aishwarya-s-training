interface I11
{
int id=55; 
}
interface I2 extends I11
{
}
class Test5 implements I2
{
public static void main(String args[])
{
System.out.println("value of id="+id);
}}