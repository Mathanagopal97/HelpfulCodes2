import java.util.*;
class Hashmap
{
   public static void main(String [] args)
   {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();    
      System.out.println("Initial list of elements: "+hm);  
      hm.put(100,"Amit");    
      hm.put(101,"Vijay");    
      hm.put(102,"Rahul");   
         
      for(Map.Entry m:hm.entrySet()){    
         System.out.println(m.getKey()+" "+m.getValue());    
      }  
        
      hm.putIfAbsent(103, "Gaurav");  
      System.out.println("After invoking putIfAbsent() method ");  
      for(Map.Entry m:hm.entrySet()){    
         System.out.println(m.getKey()+" "+m.getValue());    
      }    
      System.out.println();
      hm.put(103,"Ravi");  
      hm.remove(100);       
      for(Map.Entry m:hm.entrySet()){    
         System.out.println(m.getKey()+" "+m.getValue());    
      }
          
   }}