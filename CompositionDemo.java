class CompositionDemo{
   public static void main(String[]args){
   
      CompDemoClassA cdca = new CompDemoClassA();
      System.out.println(cdca.getVar());
      System.out.println(cdca.getName());
   
      Thread t1=
         new Thread(){  
            public void run(){ 
               Muhil mh = new Muhil();
               mh.main(args);
            }  
         };
      Thread t2=
         new Thread(){  
            public void run(){ 
               EnumDemo ed = new EnumDemo();
               ed.main(args);
            }  
         };
         
      t1.start();
      try{
         t1.join();
      }
      catch(Exception e){
         System.out.println(e.getMessage());
      }
      t2.start();
   }

}