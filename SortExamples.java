class SortExamples{

   public static void display(int[] arr){
      for(int i:arr) System.out.print(i+" ");
      System.out.println();
   }

   public static void BubbleSort(int[] arr){
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr.length-1-i; j++) { 
            if(arr[j]>arr[j+1])
            {
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            }
         }
      }
      display(arr);
   }
   
   public static void InsertionSort(int[] arr){
      for (int i = 1; i < arr.length; i++) 
      { 
         int valueToSort = arr[i]; 
         int j;
         for (j = i; j > 0 && arr[j - 1] > valueToSort; j--) {
            arr[j] = arr[j - 1];
         }
         arr[j] = valueToSort;
      }
      display(arr);
   }
   
   public static void SelectionSort(int[] arr){
      for (int i = 0; i < arr.length - 1; i++)
      {
         int index = i;
         for (int j = i + 1; j < arr.length; j++)
            if (arr[j] < arr[index]) 
               index = j;
      
         int smallerNumber = arr[index]; 
         arr[index] = arr[i];
         arr[i] = smallerNumber;
      }
      display(arr);
   }
   
   public static void QuickSort(int left,int right,int[] arr){
      int i=left;
      int j=right;
      int pivot = arr[left+(right-left)/2];
      while(i<=j){
         while(arr[i]<pivot) i++; 
         while(arr[j]>pivot) j--;
         if(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
         }
      }
   
      if(left<j) QuickSort(left,j,arr);
      if(i<right) QuickSort(i,right,arr);
      
     
   }
   
   public static void MergeSort(int[] arr, int start, int end){
      int mid = (start+end)/2;
      if(start<end){
         MergeSort(arr,start,mid);
         MergeSort(arr,mid+1,end);
         Merge(arr,start,mid,end);
      }
   }
   
   public static void Merge(int[] arr, int start, int mid, int end){
      int[] tempArr = new int[arr.length];
      int tempStartIndex = start;
   
      int startIndex = start;
      int midIndex=mid+1;
   
      while(startIndex<=mid && midIndex<=end){
         if(arr[startIndex] < arr[midIndex]) tempArr[tempStartIndex++] = arr[startIndex++];
         else tempArr[tempStartIndex++] = arr[midIndex++];
      }
   
      while(startIndex<=mid) tempArr[tempStartIndex++] = arr[startIndex++];
      while(midIndex<=end) tempArr[tempStartIndex++] = arr[midIndex++];
   
      for(int i=start;i<=end;i++) arr[i] = tempArr[i];
   
   }
   
   public static void ShellSort(int[] arr){
      int h = 1;
      while (h <= arr.length / 3) {
         h = 3 * h + 1;
      }
   
      while (h > 0) { 
         for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j; 
            for (j = i; j > h - 1 && arr[j - h] >= temp; j = j - h) {
               if(arr[j-h]>=temp) arr[j] = arr[j - h];
            }
            arr[j] = temp;
         }
         h = (h - 1) / 3;
      }
      display(arr);
   }
   public static void main(String[]args){
      int[] arr = {7,6,8,9,3,2,10,5,1};
      System.out.println("Bubble Sort");
      BubbleSort(arr);
      System.out.println("Insertion Sort");
      int[] arr1 = {7,6,8,9,3,2,10,5,1};
      InsertionSort(arr1);
      System.out.println("Selection Sort");
      int[] arr2 = {7,6,8,9,3,2,10,5,1};
      SelectionSort(arr2);
      System.out.println("Quick Sort");
      int[] arr3 = {7,6,8,9,3,2,10,5,1};
      QuickSort(0,arr3.length-1,arr3);
      display(arr3);
      System.out.println("Merge Sort");
      int[] arr4 = {7,6,8,9,3,2,10,5,1};
      MergeSort(arr4,0,arr.length-1);
      display(arr4);
      System.out.println("Shell Sort");
      int[] arr5 = {7,6,8,9,3,2,10,5,1};
      ShellSort(arr5);
   
   }

}