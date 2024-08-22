class Test21
{
void shape(int i)
{
System.out.println("Triangle");
}
void shape(float j)
{
System.out.println("Rectangle:"+j);
}
void shape(long k)
{
System.out.println("Square:"+k);
}
}
class Test2
{
public static void main(String args[])
{
Test21 t=new Test21();
t.shape(10);
t.shape(12.3f);
t.shape(221l);
}
}