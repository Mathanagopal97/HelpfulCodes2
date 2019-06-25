import java.io.*; 
  
class GFGcoins { 
   public static void main(String[] args) 
   { 
      int denominations[]=new int[] {1,2,5,10,20,50,100,200};
      int itr,jtr;
      long count[]=new long[1000001];
      count[0]=1;
      for(itr=0;itr<denominations.length;itr++)
      {
         for(jtr=denominations[itr];jtr<=100000;jtr++)
            count[jtr]+=count[jtr-denominations[itr]];
      }
      System.out.println("£10000 can be generated in "+count[10000]+" number of ways");        
   } 
 
}