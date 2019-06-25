import java.util.*;
class DateExample{
public static void main(String[]args){
Date d = new Date();
long start = System.getCurrentTimeMillis();
int a = 1000000;
for(int i=0;i<a;i++) System.out.println(i);
long end = d.getTime();
System.out.println(start+" "+end);
}
}