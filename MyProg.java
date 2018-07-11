import java.util.*;
class MyProg
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = sc.next();
String s3 = sc.next();
int len1,len2,len3;
len1 = s1.length();
len2 = s2.length();
len3 = s3.length();

if(len1==len2)
{
System.out.println(s3);
for(int i=0;i<len1;i++)
{
if(i!=0) System.out.println(s1.charAt(i)+"***"+s2.charAt(i));
}
}

if(len1==len3)
{
System.out.println(s2);
for(int i=0;i<len1;i++)
{
if(i!=0) System.out.println(s1.charAt(i)+"***"+s3.charAt(i));
}
}

if(len3==len2)
{
System.out.println(s1);
for(int i=0;i<len3;i++)
{
if(i!=0) System.out.println(s2.charAt(i)+"***"+s3.charAt(i));
}
}

}
}