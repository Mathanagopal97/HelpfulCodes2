import java.util.*;
public class State {
    
    public static String byState(String str) {
        // your code
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> address = new ArrayList<String>();
        ArrayList<String> states = new ArrayList<String>();
        str = str.replace("\n",", ");
        String[] arr = str.split(", ");
        for(int i=0;i<arr.length-2;i++){
        name.add(arr[i]);
        i++;
        address.add(arr[i]);
        i++;
        states.add(arr[i]);
        }
        for(String a:name) System.out.println(a);
        for(String a:address) System.out.println(a);
        for(String a:states) System.out.println(a);
        return "ans";
    }
    public static void main(String[]args){
    System.out.println(byState("John Daggett, 341 King Road, Plymouth MA\n" +
        "Alice Ford, 22 East Broadway, Richmond VA\n" +
        "Orville Thomas, 11345 Oak Bridge Road, Tulsa OK\n" +
        "Terry Kalkas, 402 Lans Road, Beaver Falls PA\n" +
        "Eric Adams, 20 Post Road, Sudbury MA\n" +
        "Hubert Sims, 328A Brook Road, Roanoke VA\n" +
        "Amy Wilde, 334 Bayshore Pkwy, Mountain View CA\n" +
        "Sal Carpenter, 73 6th Street, Boston MA"));
    }
}