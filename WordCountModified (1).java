import java.util.*;
class WordCountModified
{
   public static void main(String[]args)
   {
      String[] sentences = new String[5];
      Scanner sc = new Scanner(System.in);
      ArrayList<String> words = new ArrayList<>();
      for(int i=0;i<5;i++){
         sentences[i] = sc.nextLine();
      }
      for(int i=0;i<5;i++)
      {
         String givenSentence = sentences[i];
         String[] wordArray = givenSentence.split(" ");
         words.addAll(Arrays.asList(wordArray));
         int[] count = new int[wordArray.length];
         for(int j=0;j<wordArray.length;j++)
         {
            for(int k=0;k<words.size();k++)
            {
               if(wordArray[j].equals(words.get(k))) count[j]=count[j]+1;
            }
         }
         for(int cnt: count) System.out.print(cnt+" ");
         System.out.println();
      }
            
   }
}