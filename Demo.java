import java.io.*; 
  
class Demo implements java.io.Serializable 
{ 
   public int a; 
   public String b; 
 
   // Default constructor 
   public Demo(int a, String b) 
   { 
      this.a = a; 
      this.b = b; 
   } 
 
} 
  
class Test1 
{ 
   public static void main(String[] args) 
   {    
      Demo object = new Demo(1, "geeksforgeeks"); 
      String filename = "file.ser"; 
        
      // Serialization  
      try
      {    
         //Saving of object in a file 
         FileOutputStream file = new FileOutputStream(filename); 
         ObjectOutputStream out = new ObjectOutputStream(file); 
           
         // Method for serialization of object 
         out.writeObject(object); 
           
         out.close(); 
         file.close(); 
           
         System.out.println("Object has been serialized"); 
      
      } 
       
      catch(IOException ex) 
      { 
         System.out.println("IOException is caught"); 
      }   
   } 
}