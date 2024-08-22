import java.util.*;
class STDemo
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Royal challengers Bengaluru");
int count=st.countTokens();
System.out.println("No. of tokens:"+count);
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}}}
