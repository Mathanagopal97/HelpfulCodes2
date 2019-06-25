import java.util.Arrays;
import java.util.*;

public class ProgramOne {
	
	public ArrayList<Integer> changedElements(ArrayList<Integer> list1,ArrayList<Integer> list2)
	{
		if(list1.size()<list2.size())
		{
				for(int j=0;j<list1.size();j++)
				{
					if(list2.contains(list1.get(j))) {list2.remove(list2.indexOf(list1.get(j)));}
				}

         return list2;
		}
		else
		{
				for(int j=0;j<list2.size();j++)
				{
					if(list1.contains(list2.get(j))) {list1.remove(list1.indexOf(list2.get(j)));}
				}

          return list1;
		}
		
	}

	public static void main(String[] args) {
		ProgramOne pOne = new ProgramOne();
      ArrayList<Integer> list1=new ArrayList<Integer>();
      ArrayList<Integer> list2=new ArrayList<Integer>();
      Random rand = new Random();
      int imax = rand.nextInt(10) + 1;
      for(int i=0;i<imax;i++)
      {
         int n = rand.nextInt(50) + 1;
         int n2 = rand.nextInt(50) +1;
         list1.add(n); 
         list2.add(n);
         list2.add(n2);
      }
      Iterator itr = list1.iterator();
      System.out.print("List 1: ");
		while(itr.hasNext()){  
         System.out.print(itr.next()+" ");}
		System.out.println();
      itr=list2.iterator();
      System.out.print("List 2: ");
      while(itr.hasNext()){  
         System.out.print(itr.next()+" ");}
		System.out.println();
      ArrayList<Integer> ans = pOne.changedElements(list1, list2);
		System.out.println("The items added to the second list are:"); 
      itr = ans.iterator();
      while(itr.hasNext()){  
         System.out.print(itr.next()+" ");}
		System.out.println();
		list1.clear();
      list2.clear();
      int jmax = rand.nextInt(10) + 1;
      for(int i=0;i<jmax;i++)
      {
         int n = rand.nextInt(50) + 1;
         int n2 = rand.nextInt(50) +1;
         list2.add(n); 
         list1.add(n);
         list1.add(n2);
      }
      itr = list1.iterator();
      System.out.println("\n");
      System.out.print("List 1: ");
      while(itr.hasNext()){  
         System.out.print(itr.next()+" ");}
		System.out.println();
      itr=list2.iterator();
      System.out.print("List 2: ");
      while(itr.hasNext()){  
         System.out.print(itr.next()+" ");}
		System.out.println();
		System.out.println("The items removed from the first list are:");
      ans = pOne.changedElements(list1, list2);
      itr=ans.iterator(); 
      while(itr.hasNext()){  
         System.out.print(itr.next()+" ");}
		System.out.println();
	}

}
