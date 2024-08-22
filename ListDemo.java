import java.util.*;
class ListDemo
{
public static void main(String args[])
{
Vector v=new Vector(2);
int n1=v.capacity();
System.out.println("Capacity of vector:"+n1);
v.add(211);
v.add(25);
v.add(523);
int n2=v.capacity();
System.out.println(v);
System.out.println("New capacity of vector"+n2);
}}