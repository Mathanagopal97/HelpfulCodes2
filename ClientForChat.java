import java.io.*;
import java.net.*;
import java.util.*;

class ClientForChat{
   public static void main(String[]args){
      try{
         Scanner sc = new Scanner(System.in);
         Socket sock = new Socket("127.0.0.1", 4242);
         System.out.println("Connected to Server!!\n Press CTRL+C to stop chatting");
         
         OutputStream ostream = sock.getOutputStream(); 
         PrintWriter pwrite = new PrintWriter(ostream, true);
      
      
         InputStream istream = sock.getInputStream();
         BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
         
               
         while(true){
            String sendmessage,recvmessage;
            sendmessage = sc.nextLine();
            pwrite.println(sendmessage);
            pwrite.flush();
            if((recvmessage = receiveRead.readLine()) != null){
               System.out.println(recvmessage); 
            }           
         //br.close();
         }
      }
      
      catch(Exception e){
         System.out.println(e.getMessage());
      }
   }
}