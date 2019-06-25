class ShellSortOnOwn
{
   public static void main(String[]args){
      int[] arr = {7,6,8,9,3,2,10,5,1};//100,20,15,30,5,75,40   7,6,8,9,3,2,10,5,1
      int gap = arr.length/2;
      System.out.println("gap = "+gap);
      int times=0;
      while(gap>=1){
         for(int i=0,j=gap;j<arr.length-1;i++,j++)
         {
            if(times==0){
               System.out.println("i and arr[i] = "+i+" "+arr[i]+"j and arr[j] = "+i+arr[j]);
               if(arr[j]<arr[i]) {
                  int temp = arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
               }
               if(i==gap) {i=j+1;}
            }
            /*else
            {
               System.out.println("i = "+i+" j = "+j);
               if(i!=gap){
                  if(arr[j]<arr[i]) {
                     int temp = arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                  }
               }
            }*/
         }
         for(int i:arr) System.out.print(i+" ");
         if(gap%2==0) gap=((gap)/2)+1;
         else gap=gap/2;
         System.out.println("gap = "+gap);
      }
      for(int i:arr) System.out.print(i+" ");  
   
   }
}