import java.io.*; 
import java.util.*;
import java.time.LocalDateTime;


class ATM_Implementation implements java.io.Serializable
{
   LocalDateTime timeoftransaction;
   public int account_number;
   public double amount;
   
   ATM_Implementation(int accnum,double amount){
      this.account_number = accnum;
      this.amount = amount;
   }
   
   ATM_Implementation(){
   
   }


   public int getAccountNumber(){
      return this.account_number;
   }
   
   public double getAmount(){
      return this.amount;
   }
   
   synchronized void performTransaction(ArrayList<Integer> accountNumbers, ArrayList<Integer> pinNumbers){
      try
      {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your account number");
         int accnum = sc.nextInt();
         System.out.println("Enter the amount");
         double amount = sc.nextDouble(); 
         ATM_Implementation atm = new ATM_Implementation(accnum,amount);
         System.out.println("Enter Pin");
         int pin = sc.nextInt();
         if(checkCredentials(accountNumbers,pinNumbers,atm.getAccountNumber(),pin)){
            System.out.println("Performing transaction........");
            Thread.sleep(4000);
            System.out.println("Success!!!\nPerformed the transaction for "+atm.getAccountNumber());
            atm.timeoftransaction=LocalDateTime.now();
            String filename = "SuccessTranscations.ser";
            try{    
               FileOutputStream file = new FileOutputStream(filename); 
               ObjectOutputStream out = new ObjectOutputStream(file); 
               out.writeObject(atm); 
               out.close(); 
               file.close(); 
               System.out.println("Object has been serialized"); 
            } 
                  
            catch(Exception e) { 
               System.out.println("Exception is caught"+e.getMessage()); 
            }
         }
         else{
            System.out.println("Wrong Credentials!!! Aborting....");
            Thread.sleep(100);
         }
      }
      catch(Exception e)
      {
         System.out.println(e.getMessage());
      }
   }
   
   public static boolean checkCredentials(ArrayList<Integer> accountNumbers, ArrayList<Integer> pinNumbers, int accnum, int pin){
      int index = accountNumbers.indexOf(accnum);
      if(index==-1){
         System.out.println("No such account number");
         return false;
      }
      int pinFromList = pinNumbers.get(index);
      if(pin!=pinFromList) 
         return false;
      else 
         return true;
   } 
   
}

class MainClass
{
   public static void main(String[]args)throws Exception
   {
      ATM_Implementation atm = new ATM_Implementation();
      ArrayList<Integer> accountNumbers = new ArrayList<Integer>();
      ArrayList<Integer> pinNumbers = new ArrayList<Integer>();
      Thread t1=
               new Thread(){  
                  public void run(){  
                     File file = new File("Acc_and_Pins.txt");
                     try{ 
                        Scanner input = new Scanner(file);
                        String st; 
                        String accnum = "",pinnum="";
                        int flag=0;
                        while (input.hasNext()) {
                           String word  = input.next();
                           if(flag==0){
                              accountNumbers.add(Integer.parseInt(word));
                              flag=1;
                           }
                           else if(flag==1){
                              pinNumbers.add(Integer.parseInt(word));
                              flag=0;
                           }
                        }
                     }
                     catch(Exception e){
                        System.out.println(e.getMessage());
                     }  
                  }  
               };
      Thread t2=
         new Thread(){  
            public void run(){ 
               atm.performTransaction(accountNumbers,pinNumbers);
            }  
         };
      Thread t3=
         new Thread(){  
            public void run(){ 
               atm.performTransaction(accountNumbers,pinNumbers);  
            }  
         };
      t1.start();
      Thread.sleep(500);
      System.out.println("Performing transaction for two persons back to back");
      t2.start(); 
      t3.start();  
   }

}