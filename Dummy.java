class Dummy
{
public static void main(String [] args)
{
int x = 5;
int y = 10;
int z = ++x * y--;
System.out.println(z);
System.out.println("1 + 2 = " + 1 + 2);
System.out.println("1 + 2 = " + (1 + 2));
System.out.println(1 + 2 + "abc");
System.out.println("abc" + 1 + 2);
}
}