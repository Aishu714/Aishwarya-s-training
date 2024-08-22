class Test8
public static void main(String args[])
{
System.out.println(" withdrawMoney(1000,500) );
System.out.println(" withdrawMoney(1200,500) );
}
static public double withdrawMoney (double balance, double amount){
assert balance >= amount;
return balance - amount;
}}