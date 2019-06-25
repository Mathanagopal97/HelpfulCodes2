import java.util.*;
import java.io.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
 
class Notepad {
   public static void main(String[] args) {
      Runtime rs = Runtime.getRuntime();
   
      try {
         rs.exec("notepad");
         Robot robot = new Robot();
         int count=100;
         while(count>0){
         robot.keyPress(KeyEvent.VK_B);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_A);
         count--;
         }         
      }
      catch (Exception e) {
         System.out.println(e);
      }
   }
}