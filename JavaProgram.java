import java.io.*;
import java.text.DecimalFormat;
/*
 * Java program that uses Abstraction, Polymorphism and Encapsulation
 */
abstract class Bank{  
   private String nameOfTheBank;
   private double rateOfInterest;
   public void setRateOfInterest(double roi)
   {
      rateOfInterest = roi;
   }
   public double getRateOfInterest()
   {
      return rateOfInterest;
   }   
   public void setName(String name)
   {
      nameOfTheBank=name;
   }
   public String getName()
   {
      return nameOfTheBank;
   }
   abstract double calculateInterest(double principle);
}  
class SBI extends Bank{  
   private String nameOfTheBank;
   private double rateOfInterest;
   public void setRateOfInterest(double roi)
   {
      rateOfInterest = roi;
   }
   public double getRateOfInterest()
   {
      return rateOfInterest;
   } 
   public void setName(String name)
   {
      nameOfTheBank=name;
   }
   public String getName()
   {
      return nameOfTheBank;
   }
       
   @Override
      double calculateInterest(double principle)
   {
      return principle * (Math.pow((1 + rateOfInterest / 100), 2));
   }
}  
class ICICI extends Bank{  
   private String nameOfTheBank;
   private double rateOfInterest;
   public void setRateOfInterest(double roi)
   {
      rateOfInterest = roi;
   }
   public double getRateOfInterest()
   {
      return rateOfInterest;
   } 
   public void setName(String name)
   {
      nameOfTheBank=name;
   }
   public String getName()
   {
      return nameOfTheBank;
   }
   @Override
      double calculateInterest(double principle)
   {
      return principle * (Math.pow((1 + rateOfInterest / 100), 3));
   }
}  
class AXIS extends Bank{  
   private String nameOfTheBank;
   private double rateOfInterest;
   public void setRateOfInterest(double roi)
   {
      rateOfInterest = roi;
   }
   public double getRateOfInterest()
   {
      return rateOfInterest;
   }   
   @Override
      double calculateInterest(double principle)
   {
      return principle * (Math.pow((1 + rateOfInterest / 100), 5));
   }
}  
class JavaProgram{  
   private static DecimalFormat df2 = new DecimalFormat(".###");

   public static void main(String args[]){  
      Bank b;  
      b=new SBI();  
      b.setName("SBI");
      b.setRateOfInterest(8.4);
      System.out.println(b.getName()+" Rate of Interest: "+b.getRateOfInterest());
      System.out.println("Compound Interest of Rs. 10,000 for two years is "+df2.format(b.calculateInterest(10000)));   
      b=new ICICI();  
      b.setName("ICICI");
      b.setRateOfInterest(7.3);
      System.out.println(b.getName()+" Rate of Interest: "+b.getRateOfInterest());
      System.out.println("Compound Interest of Rs. 10,000 for two years is "+df2.format(b.calculateInterest(10000)));
      b=new AXIS();  
      b.setName("AXIS");
      b.setRateOfInterest(9.7);
      System.out.println(b.getName()+" Rate of Interest: "+b.getRateOfInterest());
      System.out.println("Compound Interest of Rs. 10,000 for two years is "+df2.format(b.calculateInterest(10000))); 
   }  
}