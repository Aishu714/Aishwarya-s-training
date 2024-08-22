class Test22
{
void show()
{
System.out.println("Parent class");
}}
class Test11 extends Test22
{
void show()
{
super.show();
{
System.out.println("child class");
}}}
class Test3
{
public static void main(String args[])
{
Test11 t=new Test11();
t.show();
}}