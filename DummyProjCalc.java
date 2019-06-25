import java.util.*;
class DummyProjCalc
{
   public static void main(String[]args){
      String bookedSlots = "12:12:00 to 14:12:00, 14:30:00 to 18:30:00, 10:00:00 to 12:00:00";
      List<String> BookedSlots = new ArrayList<>();
      List<String> BookedTimes = new ArrayList<>();
      BookedSlots = Arrays.asList(bookedSlots.split(", "));
      for (String str : BookedSlots) {
         String[] strarr = str.split(" to ");
         BookedTimes.add(strarr[0]);
         BookedTimes.add(strarr[1]);
      }
      for(String str : BookedTimes)
      {
         System.out.println(str);z
      }
   }
}