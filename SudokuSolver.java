import java.util.*;
class SudokuSolver{
/*
3 0 6 5 0 8 4 0 0
5 2 0 0 0 0 0 0 0 
0 8 7 0 0 0 0 3 1 
0 0 3 0 1 0 0 8 0 
9 0 0 8 6 3 0 0 5 
0 5 0 0 9 0 6 0 0 
1 3 0 0 0 0 2 5 0 
0 0 0 0 0 0 0 7 4 
0 0 5 2 0 6 3 0 0
*/


   public static boolean solve(int[][] a){
      int flag=0;
    
      for(int i=0; i<9; i++){
         for(int j=0; j<9; j++){
            if(a[i][j] == 0){
               flag=1;
               int psbl[] = {0,1,1,1,1,1,1,1,1,1};
                
               for(int k=0; k<9; k++){
                  psbl[a[i][k]]=0;
                  psbl[a[k][j]]=0;
               }
               int x_3 = i-i%3, y_3 = j-j%3;
               for(int x= x_3; x< x_3 +3; x++){
                  for(int y=y_3; y<y_3 +3; y++)
                     psbl[a[x][y]]=0;
               }
                
               for(int z=1; z<=9; z++){
                  if(psbl[z] == 1){
                     System.out.println("writting "+z+" at a["+i+","+j+"]");
                     a[i][j] = z;
                     if(solve(a)){
                        System.out.println("If Condtion writting "+z+" at a["+i+","+j+"]");
                        return true;
                     }
                  }
               }
               return false;
            }
         }
      }
    
      if(flag==0){
        // cout<<"\n###Solution is :- "<<endl;
         for(int i=0; i<10; i++){
            for(int j=0; j<10; j++)
               System.out.println(a[i][j]+" ");
         }
         System.out.println();
         return true;
      }
      else {
      return true;
      }
   }

   public static void main(String[]args) {
      int[][] input = new int[9][9];
      Scanner sc = new Scanner(System.in);
   
   
      for(int i=0; i<9; i++){
         for(int j=0; j<9; j++){
            input[i][j] = sc.nextInt();
         }
      }
      solve(input);
   
   
   }
}

