import java.lang.*;
public class JapaneseName {

    static String[] alphabet = new String[]{
        "ka", "zu", "mi", "te", "ku",
        "lu", "ji", "ri", "ki", "zusu",
        "me", "ta", "rin", "to", "mo",
        "no", "ke", "shi", "ari", "chi",
        "do", "ru", "mei", "na", "fu", "zi"
    };

    static String asciiConvertToJapanese(String name) {
        String output = "";
        int spaceCount=0;
        System.out.println(name);
        if(name.length()==0) return output;
        for(int i=0;i<name.length();i++){
        char ch = name.charAt(i);
        if(ch==' ') {output=output+" ";spaceCount=0;}
        else if(Character.isUpperCase(ch) && spaceCount==0 || i==0){
          ch = Character.toUpperCase(ch);
          int index = (int) ch;
          if(index<=64||index>=90) return "Only ASCII";
          String inter = alphabet[index-65];
          String str = ""+ inter.charAt(0);
          String str2 = str.toUpperCase();
          inter = inter.replace(str,str2);
          for(int k=0;k<inter.length();k++){
          output = output+inter.charAt(k);
          spaceCount=1;
          }
        }
        else{
        ch = Character.toLowerCase(ch);
        int index = (int) ch;
        if(index<=96||index>122) return "Only ASCII";
        output = output+alphabet[index-97];
        }
        }
        return output;
    }

    
    public static void main(String[]args){
    System.out.println(asciiConvertToJapanese("Ruslan López"));
    }
}