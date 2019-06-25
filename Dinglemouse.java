class Dinglemouse {
  
   private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
   public static String rotateOnce(String input, int rotor){
      String output="";
      for(int i=0;i<input.length();i++){
         output = output+ALPHABET.charAt((ALPHABET.indexOf(input.charAt(i))+rotor)%ALPHABET.length()); 
      }
      return output;
   }
  
   public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
      String[] ans = new String[lines.length];    
      for(int i=0;i<lines.length;i++){
         String tstcase = lines[i];
         String finalres = "";
         for(int j=0;j<tstcase.length();j++) {
            tstcase = rotateOnce(tstcase,rotors[i][j]);
            finalres = finalres+tstcase.charAt(j);
         }
         ans[i] = finalres;
      }
      return ans;
   }
  
   public static void main(String [] args){
      String[] before =new String[]{"CODE"};
      int[][] rotors =  new int[][]{{20,20,28,0}};
      String[] after = Dinglemouse.flapDisplay(before,rotors);
      for(String str:after) System.out.println(str);
   }
  
}