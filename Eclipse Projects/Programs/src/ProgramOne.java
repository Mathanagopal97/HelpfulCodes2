import java.util.Arrays;

public class ProgramOne {
	
	public int[] changedElements(int[] arr1,int[] arr2)
	{
		int size1 = arr1.length;
		int size2= arr2.length;
		int arrsize = size1>size2 ? size1-size2 : size2-size1;
		int[] ans = new int[arrsize];
		int k=0;
		if(size1<size2)
		{
			for(int i=0;i<size2;i++)
			{
				int flag = 0;
				int tstcase = arr2[i];
				for(int j=0;j<size1;j++)
				{
					if(tstcase==arr1[j]) {flag=1; break;}
				}
				if(flag==0) {ans[k]=tstcase;k++;}
			}
		}
		else
		{
			for(int i=0;i<size1;i++)
			{
				int flag = 0;
				int tstcase = arr1[i];
				for(int j=0;j<size2;j++)
				{
					if(tstcase==arr2[j]) {flag=1; break;}
				}
				if(flag==0) {ans[k]=tstcase;k++;}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramOne pOne = new ProgramOne();
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {1,3,5,6};
		int[] ans = pOne.changedElements(arr1, arr2);
		for(int i: arr1) System.out.print(i+" ");
		System.out.println();
		for(int i: arr2) System.out.print(i+" ");
		System.out.println();
		System.out.println("The difference in the two arrays are:");
		for(int i: ans) System.out.print(i+" ");
		System.out.println();
		int[] arr3 = {12,34,52,63,42,23};
		int[] arr4 = {12,34,52,56,63,42,23,67,98};
		ans = pOne.changedElements(arr3, arr4);
		for(int i: arr3) System.out.print(i+" ");
		System.out.println();
		for(int i: arr4) System.out.print(i+" ");
		System.out.println();
		System.out.println("The difference in the two arrays are:");
		for(int i: ans) System.out.print(i+" ");


	}

}
