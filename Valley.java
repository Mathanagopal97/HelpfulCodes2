import java.util.*;
public class Valley {
    
   public static int[] makeValley(int[] arr) {
        // your code
      int[] arr1 = new int[arr.length];        
      int mid = arr.length/2;
      int[] ans = new int[arr.length];
      //ans[mid]=arr[mid];    
      int size = arr.length;
      int[] subarr1 = new int[arr.length/2];
      int[] subarr2 = new int[arr.length/2];
      for(int i=0;i<arr.length;i++){
         if(i==mid) continue;
         arr1[i]=arr[i];
      }
      int ctr1=0,ctr2=0;
      Arrays.sort(arr1);
      for(int i:arr1) System.out.print(i+" ");
      System.out.println();
      int flag=0;
      for(int i=0;i<arr1.length;i++){
         if(flag==0){
            subarr1[ctr1++] = arr1[i];
            flag=1;
         }
         else{
            subarr2[ctr2++] = arr1[i];
            flag=0;
         }
      }
      ctr1=0;      
      //for(int i:subarr1)  System.out.print(i+" ");
      System.out.println();
      for(int i:subarr2)System.out.print(i+" ");
      System.out.println();
      for(int i:subarr1) System.out.print(i+" ");
        return ans;
   } 
   
   public static void main(String[]args){
   int[] arr = {67, 93, 100, -16, 65, 97, 92};
   for(int i:makeValley(arr)) System.out.print(i+" ");
   
   }   
}