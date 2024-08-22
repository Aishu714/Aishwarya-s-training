import java.util.Arrays;
class Test49 
{
public static void main(String[] args)
{
int a[]={44,22,53,12};
System.out.println("Accepted elements of array");
for(int i:a);
{
System.out.println(i);
}
Arrays.parallelSort(a);
System.out.println("Sorted elements of array");
for(int i:a)
{
System.out.println(i);
}}}