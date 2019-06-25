class ReverseRotor {
  
   private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

   public static int findDiffInPos(char ch1, char ch2){
      return ALPHABET.indexOf(ch1)-ALPHABET.indexOf(ch2);
   }
   
   public static void displayArr(int[][] arr,int start, int end){
      for(int i=0;i<start;i++){
         for(int j=0;j<end;j++){
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
      }
   }
   
      public static String rotateOnce(String input, int rotor){
      String output="";
      for(int i=0;i<input.length();i++){
         output = output+ALPHABET.charAt((ALPHABET.indexOf(input.charAt(i))+rotor)%ALPHABET.length()); 
      }
      return output;
   }
   
//    public static String changeTheWord(String word,int[][] arr,int start,int end,int pos){
//       String output="";
//       for(int i=0;i<start;i++){
//          for(int j=pos;j<end;j++){
//             char ch=word.charAt(pos);
//             int index = ALPHABET.indexOf(ch);
//             index = index+arr[i][j];
//             index=index%ALPHABET.length();
//             ch=ALPHABET.charAt(index);
//             output=output+ch;
//          }
//       }
//       String front="";
//       for(int i=0;i<pos;i++) front+=word.charAt(i);
//       output=front+output;
//       for(int i=pos+1;i<word.length();i++) output+=word.charAt(i);
//       return output;
//    }
   public static int[][] flapRotors(final String[] linesBefore, final String[] linesAfter) {
      int[][] ans = new int[linesBefore.length][linesBefore[0].length()];
      int times=0;
      int ctr1=0,ctr2=0,j=0;
      int k=0;//linesBefore.length;
      int l=0;//linesBefore[0].length();
      do{
         for(int i=0;i<linesBefore.length;i++){
            String tstcase = linesBefore[i];
            System.out.println("Start of the for loop with the word as "+tstcase);
            char ch1 = tstcase.charAt(j);
            char ch2 = linesAfter[i].charAt(j);
            int index = findDiffInPos(ch1,ch2);
            if(index<0) index*=-1;
            System.out.println("Got the rotor as "+index+" and incrementing from "+ctr1);
            ans[k][l]=index; 
            l++;
            System.out.println("After incrementing");
            displayArr(ans,linesBefore.length,linesBefore[0].length());
            linesBefore[i] = rotateOnce(linesBefore[i],index);
            System.out.println(linesBefore[i]);
            times++;j++;ctr1++;
         }
         if(times>=linesBefore[0].length()) 
            break;
      }while(true);
      return ans;
   }
  
   public static void main(String [] args){
     /* String[] before =new String[]{"CODE"};
      int[][] rotors =  new int[][]{{20,20,28,0}};
      String[] after = ReverseRotor.flapDisplay(before,rotors);
      for(String str:after) System.out.println(str);*/
      
      String[] before1 = new String[] { "CODE" };
      String[] after1 =  new String[] { "WARS" }    ;
      int[][] rotors1= new int[][] { { 20, 20, 28, 0 } };
      
      int[][] ans = flapRotors(before1,after1);
      for(int i=0;i<before1.length;i++){
         for(int j=0;j<before1[0].length();j++){
            System.out.print(ans[i][j]+" ");
         }
         System.out.println();
      }
   }
  
}