import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileWriter; 


public class DownloadPage {

   public static void main(String[] args) throws IOException {
      try{
        // Make a URL to the web page
         URL url = new URL("https://www.goodreads.com/book/show/7094569-feed");
      
        // Get the input stream through URL Connection
         URLConnection con = url.openConnection();
         InputStream is =con.getInputStream();      
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         String line = null;
         FileWriter fw=new FileWriter("webpage.htm"); 
         while ((line = br.readLine()) != null) {
            System.out.println(line);
            fw.write(line+"\n");
         }
         fw.close();
      }
      catch(Exception e){System.out.println(e);}     
   }
}