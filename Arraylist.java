import java.util.*;
class Arraylist
{
   public static void main(String [] args)
   {
   
      ArrayList<String> list=new ArrayList<String>(); 
      list.add("Ravi");  
      list.add("Vijay");  
      list.add("Ram");  
      list.add("Ajay");  
   
      Iterator itr=list.iterator();  
      while(itr.hasNext()){  
         System.out.println(itr.next());  
      }
      System.out.println();
      //Removing the element
      for(int i=0;i<list.size();i++)
      {
         if(list.get(i).equals("Ram")) list.remove(i);
      } 
   
      itr=list.iterator();  
      while(itr.hasNext()){  
         System.out.println(itr.next());  
      
      } 
      System.out.println("\nUsing For-Each");
      for(String str:list) System.out.println(str);
   }
}
