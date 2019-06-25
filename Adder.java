import static java.lang.System.out;
public class Adder
{
public static int addOne(int a){
return ++a;
}
public static void main(String[]args)
{
int a=5;
int result = Adder.addOne(a);
out.println(result);

if(result==6) out.println("pass");
else out.println("fails");
}
}