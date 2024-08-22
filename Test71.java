import java.lang.*;
class Test71
{
public static void main(String[] args)
{
int a[][]=new int[3][3];
a[0][0]=55;
a[1][1]=77;
a[1][2]=43;
for(int r=0; r<3;r++){
for(int c=0; c<3; c++){
System.out.print(a[r] [c]+"\t");
}
System.out.println();
}}}