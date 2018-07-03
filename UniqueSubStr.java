/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		String str = "aabc";
		int n = str.length();
		String print = "";
		String[] substr = new String[n*n];
		int itr=0;
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
	
	
	
	
	String str2 = "ccdb";
		int n2 = str.length();
		String print2 = "";
		String[] substr2 = new String[n*n];
		int itr2=0;
	for (int len = 1; len <= n2; len++) 
	{ 
		for (int i = 0; i <= n2 - len; i++) 
		{
			int j = i + len - 1;		 
			for (int k = i; k <= j; k++) 
				print2 = print2+str2.charAt(k);
			
			List<String> list2 = Arrays.asList(substr2);
			if(list2.contains(print2)==false)
			{
			    substr2[itr2]=print2;
			    itr2++;
			}
			print2="";
		}
	}
	
	List<String> list1 = Arrays.asList(substr);
    List<String> list2 = Arrays.asList(substr2);
	Set<String> union = new HashSet<String>(list1);
    union.addAll(list2);
    // Prepare an intersection
    Set<String> intersection = new HashSet<String>(list1);
    intersection.retainAll(list2);
    // Subtract the intersection from the union
    union.removeAll(intersection);
    // Print the result
	for (String n1 : union) {
        System.out.println(n1);
    }
	}
}
