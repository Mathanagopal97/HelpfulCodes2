import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ClickSideArrow
{
   public static void main(String[]args){
      try{
         Thread.sleep(5000);
         int count=710;
         while(count-->0){
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
         }
         System.exit(0);
      }
      catch(Exception e){
         System.out.println(e.getMessage());
      }
   
   }
}