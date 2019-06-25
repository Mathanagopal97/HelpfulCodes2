import java.util.*;
class Muhil
{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size = sc.nextInt();
      int max = Integer.MIN_VALUE;
      System.out.println("Enter the values");
      int prevmax=0;
      int min = Integer.MAX_VALUE;
      int prevmin=0;
      int mxflag=0;
      int[] arr = new int[size];
      for(int i=0;i<size;i++)
      {
         int tstcase = sc.nextInt();
         if(max<tstcase){ 
            if(mxflag>0) prevmax = max;
            max = tstcase;
            //System.out.println("tstcase = "+tstcase+" max = "+max+" prevmax = "+prevmax);
            mxflag++;
         }
         else if(prevmax<tstcase && max!=tstcase) prevmax = tstcase;
         
         //min and prevmin
         if(min>tstcase){
            prevmin = min;
            min=tstcase;
         }
         else if((prevmin>tstcase&&min!=tstcase)) prevmin = tstcase; 
         
      }
      System.out.println(prevmax);
      System.out.println(prevmin);   
   }
}