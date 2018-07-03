/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class UniqueSubStr {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		int n = str.length();
		int n2 = str.length();
		String[] substr = new String[n*n];
		String[] substr2 = new String[n2*n2];
		String print = "";
		int itr=0;		
		int itr2=0;
	for (int len = 1; len <= n; len++) 
	{ 
		for (int i = 0; i <= n - len; i++) 
		{
			int j = i + len - 1;		 
			for (int k = i; k <= j; k++) 
				print = print+str.charAt(k);
			
			List<String> list = Arrays.asList(substr);
			if(list.contains(print)==false)
			{
			    substr[itr]=print;
			    itr++;
			}
			print="";
		}
	}
	print="";
	for (int len = 1; len <= n2; len++) 
	{ 
		for (int i = 0; i <= n2 - len; i++) 
		{
			int j = i + len - 1;		 
			for (int k = i; k <= j; k++) 
				print = print+str2.charAt(k);
			
			List<String> list2 = Arrays.asList(substr2);
			if(list2.contains(print2)==false)
			{
			    substr2[itr2]=print2;
			    itr2++;
			}
			print="";
		}
	}
		
	List<String> list1 = Arrays.asList(substr);
        List<String> list2 = Arrays.asList(substr2);
	Set<String> union = new HashSet<String>(list1);
        union.addAll(list2);
        Set<String> intersection = new HashSet<String>(list1);
        intersection.retainAll(list2);
        union.removeAll(intersection);
	for (String n1 : union) {
        System.out.println(n1);
    }
	}
}
