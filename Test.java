public class Test {

   int a;
   public static void main(String[] args) {
      Test t1 = new Test();
      t1.a=10;
      Test t2 = new Test();
      t2.a=100;
      swap(t1, t2);
      System.out.println(t1.a+ " " +t2.a);
   }

   private static void swap(Test t1,Test t2) {
      Test temp = new Test();
      temp.a = t1.a;
      t1.a = t2.a;
      t2.a = temp.a;
   }
}