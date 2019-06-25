import java.awt.Robot;
import java.util.Random;
class ConstantActive{  
   public static void main(String[]args){
      try{
         Robot robot = new Robot();
         Random random = new Random();
         int count=0;
         while(true){
            robot.mouseMove(random.nextInt(400), random.nextInt(400));
            System.out.println(count++);
            Thread.sleep(60000);
         }      
      }
      catch(Exception e){System.out.println(e.getMessage());}
   }
}