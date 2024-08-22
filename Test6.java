interface I1
{
void show();
}
class Test5 implements I1
{
public void show()
{
System.out .println("show method");
}}
class Test6
{
public static void main(String args[])
{
Test5 t=new Test5();
t.show();
}}