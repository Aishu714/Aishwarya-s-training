import java.io.*;
class Test7
{
public static void main(String args[]) throws Exception
{
try 
{
FileReader fr=new FileReader("table.txt");
}
catch(IOException ie)
{
System.out.println("IOException");
}
catch (Exception e)
{
System.out.println("Parent Exception");
}}}