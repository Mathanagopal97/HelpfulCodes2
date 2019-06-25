import java.util.*;
class ListImpli
{
public static void main(String [] args)
{
   ArrayList<Integer> list1=new ArrayList<Integer>();
   ArrayList<Integer> list2=new ArrayList<Integer>();
   Random rand = new Random();
   int imax = rand.nextInt(10) + 1;
   for(int i=0;i<imax;i++)
   {
      int n = rand.nextInt(50) + 1;
      int n2 = rand.nextInt(50) +1;
      int n3 = rand.nextInt(10) +1;
      list1.add(n);
      if(n3%2==0) list2.add(n);
      list2.add(n2);
   }
   Iterator itr=list1.iterator();  
   while(itr.hasNext()){  
      System.out.print(itr.next()+",");  
   }  
   System.out.println();
   itr = list2.iterator();
   while(itr.hasNext()){  
      System.out.print(itr.next()+",");  
   } 
   
}
}