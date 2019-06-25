import java.io.*; 
import java.util.*;
  
class Test 
{ 
   public static void main(String[] args) 
   { 
      System.out.println("Enter file name without the extension");
      Scanner sc = new Scanner(System.in);
      String filename = sc.next()+".ser"; 
      Demo object1 = null; 
      try
      {    
         FileInputStream file = new FileInputStream(filename); 
         ObjectInputStream in = new ObjectInputStream(file); 
         object1 = (Demo)in.readObject(); 
         in.close(); 
         file.close();           
         System.out.println("Object has been deserialized "); 
         System.out.println("a = " + object1.a); 
         System.out.println("b = " + object1.b); 
      } 
       
      catch(Exception ex) 
      { 
         System.out.println("Exception!!!\n"+ex.getMessage()); 
      } 
   
   } 
}