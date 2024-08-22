abstract class Abs
{
abstract void show();
void disp()
{
System.out.println("Complete method");
}}
class Test33 extends Abs
{
void show()
{
System.out.println("abstract method of class");
}
}
class Test4
{
public static void main(String args[])
{
Test33 t=new Test33();
t.show();
t.disp();
}}