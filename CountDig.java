public class CountDig {
    
   public static int nbDig(int n, int d) {
        // your code
      int count=0;
      for(int i=0;i<=n;i++){
         int a=i*i;
         String dummy = ""+a;
         for(int j=0;j<dummy.length();j++){
            a = Integer.parseInt(""+dummy.charAt(j));
            if(a==d) count++;
         }
      }
      return count;
   }
   public static void main(String[]args){
      System.out.println(nbDig(5750, 0));
   }
}