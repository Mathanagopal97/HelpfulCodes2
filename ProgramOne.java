import java.util.Arrays;
import java.util.*;

public class ProgramOne {
	
	public ArrayList<Integer> removedElements(int[] arr1,int[] arr2)
	{
		ArrayList<Integer> removedElementsList = new ArrayList<Integer>();
		int k=0;
			for(int i=0;i<arr1.length;i++)
			{
				int flag = 0;
				int tstcase = arr1[i];
				for(int j=0;j<arr2.length;j++)
				{
					if(tstcase==arr2[j]) {flag=1; break;}
				}
				if(flag==0) {removedElementsList.add(tstcase);k++;}
			}
		return removedElementsList;
	}
   
	public ArrayList<Integer> addedElements(int[] arr1,int[] arr2)
	{
		ArrayList<Integer> addedElementsList = new ArrayList<Integer>();
		int k=0;
			for(int i=0;i<arr2.length;i++)
			{
				int flag = 0;
				int tstcase = arr2[i];
				for(int j=0;j<arr1.length;j++)
				{
					if(tstcase==arr1[j]) {flag=1; break;}
				}
				if(flag==0) {addedElementsList.add(tstcase);k++;}
			}
		return addedElementsList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramOne pOne = new ProgramOne();
		int[] arr1 = {1,2,3,4,7,8};
		int[] arr2 = {9,10,5,6};
		ArrayList<Integer> ans = pOne.removedElements(arr1, arr2);
		for(int i: arr1) System.out.print(i+" ");
		System.out.println();
		for(int i: arr2) System.out.print(i+" ");
		System.out.println();
		System.out.println("The items removed from the first array are:");
      Iterator itr = ans.iterator();
      while(itr.hasNext()) System.out.print(itr.next()+" ");
		System.out.println();
		int[] arr3 = {12,34,52,63,42,23,35,46,67};
		int[] arr4 = {12,34,56,52,98,63,42,67,23};
		ans = pOne.addedElements(arr3, arr4);
		for(int i: arr3) System.out.print(i+" ");
		System.out.println();
		for(int i: arr4) System.out.print(i+" ");
		System.out.println();
		System.out.println("The items added to the second array are:");
      itr = ans.iterator();
		while(itr.hasNext()) System.out.print(itr.next()+" ");

	}

}
