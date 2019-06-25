import java.util.*;

/*
 0 1 2 3 4 5 6
A
B
C
D
E
F
G
7*7 MATRIX INPUT FIELDS
Once the user gueses one cell we have change that to any other value to prevent the user from cheating. In this case we change it to 2.
*/

class SinkADotCom{   
   public static int getRowNum(char ch){
      switch(ch)
      {
         case 'A' : 
            return 0;
         case 'B' : 
            return 1; 
         case 'C' : 
            return 2;
         case 'D' : 
            return 3; 
         case 'E' : 
            return 4;
         case 'F' : 
            return 5;
         case 'G' : 
            return 6;
         default : 
            return 0;
      }
   }
      
   public static void PlayGame(int[][] arr,String name){
      Random rand = new Random();
      int rowNum = rand.nextInt(4)+ 0;
      System.out.println(rowNum);
      int colNum=0;
      colNum = rand.nextInt(4)+ 0;
      System.out.println(colNum);
      int movement = rand.nextInt(10) + 1;
      GenerateMatrix(arr,rowNum,colNum,movement);
      for(int i=0;i<7;i++){
         for(int j=0;j<7;j++){
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
    // getUserInput(arr,name);
   }
   
   public static void GenerateMatrix(int[][] arr,int rowNum,int colNum,int movement){
      int times=0;
      boolean flag=false;
      if(rowNum>0&&colNum>0&&rowNum<5&&colNum<5){
         if(movement%2==0){
            if(arr[rowNum][colNum]==1 || arr[rowNum+1][colNum]==1 || arr[rowNum+2][colNum]==1
               || arr[rowNum][colNum]==2 || arr[rowNum+1][colNum]==2 || arr[rowNum+2][colNum]==2){
               flag=true;
               rowNum+=1;
               colNum+=1;
            }
         }
         else{
            if(arr[rowNum][colNum]==1 || arr[rowNum][colNum+1]==1 || arr[rowNum][colNum+2]==1
               || arr[rowNum][colNum]==2 || arr[rowNum][colNum+1]==2 || arr[rowNum][colNum+2]==2){
               flag=true;
               colNum+=1;
               rowNum+=1;
            }
         }
      }
      
      else if(rowNum==0||colNum==0){         
         if(arr[rowNum][colNum]==1|| arr[rowNum+1][colNum]==1 || arr[rowNum+2][colNum]==1 || arr[rowNum][colNum+1]==1 || arr[rowNum][colNum+2]==1
            || arr[rowNum][colNum]==2|| arr[rowNum+1][colNum]==2 || arr[rowNum+2][colNum]==2 || arr[rowNum][colNum+1]==2 || arr[rowNum][colNum+2]==2){
            flag=true;
            if(rowNum==0) rowNum+=1;
            if(colNum==0) colNum+=1;
         }
      }
   
      rowNum=rowNum%5;
      colNum=colNum%5;
      if(flag==true) GenerateMatrix(arr,rowNum,colNum,movement);
      else{
         if(movement%2==0) {
            while(times<3) {
               arr[rowNum][colNum]=1;
               rowNum++;times++;
            }
         }
         else{
            while(times<3) {
               arr[rowNum][colNum]=1;
               colNum++;times++;
            }
         }
      }
   }
   
   public static void getUserInput(int[][] arr,String name){
      Scanner sc = new Scanner(System.in);
      boolean hit=false;
      int hitCount=0;
      int guessCount = 0;
      while(!hit){
         System.out.println("Enter a guess");
         guessCount++;
         String input = sc.next();
         char ch = input.charAt(0);
         int column = Integer.parseInt(""+input.charAt(1));
         int row = getRowNum(ch);
         if(arr[row][column] == 1){ 
            
            hitCount++;
            arr[row][column]=2;
            if(hitCount<=2) System.out.println("hit");
         }
         else {
            System.out.println("miss");
         }
         if(hitCount==3){
            System.out.println("kill");
            System.out.println("Ouch! You have sinked "+name+" with "+guessCount+" guesses");
            hit=true;
         }
      }
   
   }   
   
   public static void main(String[]args){
      int[][] arr = new int[7][7];
      
      String name = "AAA.com";
      PlayGame(arr,name);
      
      name = "BBB.com";
      PlayGame(arr,name);
      
      name = "CCC.com";
      PlayGame(arr,name);      
   
   }

}