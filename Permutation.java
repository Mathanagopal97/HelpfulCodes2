// Java program to print all permutations of a 
// given string. 
public class Permutation 
{ 
   public static void main(String[] args) 
   { 
      String[] str = {"abaa", "bbbb", "baba","aabb"}; 
      int n = str.length; 
      Permutation permutation = new Permutation(); 
      permutation.permute(str, 0, n-1); 
   } 
   
   private void permute(String[] str, int l, int r) 
   { 
      if (l == r) {
         for(String input:str) System.out.print(input+" "); System.out.println();}
      else
      { 
         for (int i = l; i <= r; i++) 
         { 
            str = swap(str,l,i); 
            permute(str, l+1, r); 
            str = swap(str,l,i); 
         } 
      } 
   } 
   
   public String[] swap(String[] a, int i, int j) 
   { 
      String temp; 
      temp = a[i] ; 
      a[i] = a[j]; 
      a[j] = temp; 
      return a; 
   } 
 
}