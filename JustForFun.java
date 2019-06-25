import java.util.*;
class JustForFun{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int count1=0,count2=0;
for(int i=1, j=(int)str.charAt(0);i<str.length();j=(int)str.charAt(i),i++){
if(j>=65&&j<=91) count1++;
else if(j>=97&&j<=123) count2++;
}
System.out.println(count1);
System.out.println(count2);
}
}