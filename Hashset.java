import java.util.*;
class Hashset
{
   public static void main(String [] args)
   {
   
   
      HashSet<String> set=new HashSet<String>();  
      set.add("Ravi");  
      set.add("Vijay");  
      set.add("Ram");  
      set.add("Ajay");  
      
      Iterator<String>  itr=set.iterator();  
      while(itr.hasNext()){  
         System.out.println(itr.next());  
      }  
      System.out.println();
            
      itr=set.iterator();  
      while(itr.hasNext()){  
         if(itr.next().equals("Ram")) set.remove("Ram");  
      }  
   
      itr=set.iterator();  
      while(itr.hasNext()){  
         System.out.println(itr.next());  
      }  
      System.out.println("\n Using for-each");
      for(String str:set) System.out.println(str);
   }  
}