import java.util.*;
import java.io.*; 

class ReadSerFile{

   public static void main(String [] args){
      System.out.println("Enter file name without the extension");
      Scanner sc = new Scanner(System.in);
      String filename = sc.next()+".ser"; 
      ATM_Implementation object1 = null; 
      try
      {    
         FileInputStream file = new FileInputStream(filename); 
         ObjectInputStream in = new ObjectInputStream(file); 
         object1 = (ATM_Implementation)in.readObject(); 
         in.close(); 
         file.close();           
         System.out.println("Object has been deserialized "); 
         System.out.println("a = " + object1.account_number); 
         System.out.println("b = " + object1.amount);
         System.out.println("time = "+ object1.timeoftransaction); 
      } 
       
      catch(Exception ex) 
      { 
         System.out.println("Exception!!!\n"+ex.getMessage()); 
      }
   
   }

}