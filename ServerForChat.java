import java.io.*;
import java.net.*;
import java.util.*;

class ServerForChat{
   public static void main(String[]args){
      try{
         Scanner sc = new Scanner(System.in);
         ServerSocket servscok = new ServerSocket(4242);
         Socket sock = servscok.accept();
         System.out.println("Connected to Client!!\n Press CTRL+C to stop chatting");
      
         OutputStream ostream = sock.getOutputStream(); 
         PrintWriter pwrite = new PrintWriter(ostream, true);
         
         InputStream istream = sock.getInputStream();
         BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
         
         while(true){
            String recvmessage,sendmessage;
            if((recvmessage=receiveRead.readLine())!=null){
               System.out.println(recvmessage);
            }
            sendmessage = sc.nextLine();
            pwrite.println(sendmessage);
            pwrite.flush();
         }
      }
      
      catch(Exception e){
         System.out.println(e.getMessage());
      }
   }
}