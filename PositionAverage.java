import java.util.*;
public class PositionAverage {
   public static int compareThem(String one, String two)
   {
      int count=0;
      for(int i=0;i<one.length();i++){
         if(one.charAt(i) == two.charAt(i))count++;
      }
      System.out.println("Common between "+one+" and " +two+" is "+count); 
      return count;
   }
   public static double posAverage(String s) {
        // your code
      int diff = 0;
      s=s.replaceAll(", "," ");
      String[] arr = s.split(" ");
      double ans = 0.0;
      int comb = 0;
      for(int i=0;i<arr.length;i++)
      {
         String one = arr[i];
         for(int j=i+1;j<arr.length;j++)
         {
            String two = arr[j];
            diff = diff+compareThem(one,two);
            comb = comb+arr[j].length();
         }
      }
      System.out.println(diff+" "+comb);
      ans = (double) (diff*100)/comb;
      return ans;
   }
    
   public static void main(String[]args){
      System.out.println(posAverage("466960, 069060, 494940, 060069, 060090, 640009, 496464, 606900, 004000, 944096"));
   }
}