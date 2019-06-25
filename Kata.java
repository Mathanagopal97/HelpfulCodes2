public class Kata {
   public static String Encrypt(String input){
      String output="";
      int first = (int) input.charAt(0);
      output = output+first;//Ascii
      if(input.length()==1) 
         return output.trim();
      
      else if(input.length()==2) {
         output = output+input.charAt(1);
         return output.trim();
      }
    
      output = output+input.charAt(input.length()-1);//Appending the last letter of the world
      for(int i=2;i<input.length()-1;i++){
         output = output+input.charAt(i);
      }
      output = output+input.charAt(1);
      return output.trim();
   }
   public static String encryptThis(String text) {
        // Implement me! :)
      System.out.println(text);
      String output="";
      for(int i=0;i<text.length();i++){
         char ch = text.charAt(i);
         String inter = "";
         while(ch!=' '){
            inter = inter+ch;
            i++;
            if(i<text.length()) ch = text.charAt(i);
            else 
               break;
         }
         System.out.println("Passing "+inter);
         if(!inter.isEmpty()){
            String append = Encrypt(inter);
            System.out.println("Got "+append);
            if(i<text.length()) output = output+append+" ";
            else output = output+append;
         }  
         else output = output+" ";     
      }
      return output;
   }
    
   public static void main(String[]args){
      String s = "         dsafsdafdsa dfasfda asfdasf asdfsaf       ";
      System.out.println(encryptThis(" W pUnoa HznMyJmaTwTVlWigdsP mvOVOLhLfkwJaekA mktjekYQrfMzBkvkJ CLUlZGS TUPaXYFFgPU kQzcJmTsSVPGA SFApWwswGdXmXlaVgEB kBEoV ySSbcpSADIUQQKwY iUZ cQvmzQbvoDXotli Dfbo nzQjA zqvTfx voqkUTrSzkrKx ZRNL BAWSqINXJhKKWlSO ikTBlxcvaIOZfNtsA ATRqMXixTAYJoLcrj KP lUAnCduDhhwwVbPzy sqVRsoGiqozibikL GgfFuXULH qkXdpWqREImFA xfchY fXfUUyIvmVDOZ vnMBsMgYS ekfLVkgIpVYswe mqbLoQbRDhgKD  sOcnZktYMxbigSRpFSc oAFeL Gnst DgYbKfwbnCPHYgqN zvQjsKuErsamsTYd zePqRoKzpkpm JuxXftveYCHQ VhcrTtQdwVO kAlqfKYMQf bLYtGgYUzkQwrO qcXNMCSnl QHrrZZzCwLO ZieEzDf aWMn  ZHvhmOaNXaQ YuLxRdZZTNKit "));
      String ltrim = s.replaceAll("^\\s+","");
      System.out.println(ltrim);
   }
}