class HorseProblem {

   public static int[][] generateMatrix() {
      int[][] matrix = new int[8][8];
      // matrix[0][1] = 1
      matrix[0][0] = 1;
      return matrix;
   }

   public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            System.out.print(matrix[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static int[][] setTheHorses(int[][] matrix) {
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8;) {
            // System.out.print("Checking for "+i+" "+j+" ");
            if (matrix[i][j] != 1 && horsePlaced(i, j, matrix)) {
               matrix[i][j] = 1;
            }
            System.out.println();
            if (i % 2 == 0)
               j = j + 2;
            else
               j = j + 1;
         }
      }
      return matrix;
   }

   public static boolean horsePlaced(int iPos, int jPos, int[][] matrix) {
      int iPlus1 = iPos + 1, iMinus1 = iPos - 1, iPlus2 = iPos + 2, iMinus2 = iPos - 2;
      int jPlus1 = jPos + 1, jMinus1 = jPos - 1, jPlus2 = jPos + 2, jMinus2 = jPos - 2;

      if (iMinus2 < 8 && jMinus1 < 8 && iMinus2 >= 0 && jMinus1 >= 0) {
         if (matrix[iMinus2][jMinus1] == 1) {// System.out.println("1 condition");
            return false;
         }
      }
      if (iMinus2 < 8 && jPlus1 < 8 && iMinus2 >= 0 && jPlus1 >= 0) {
         if (matrix[iMinus2][jPlus1] == 1) {// System.out.println("2 condition");
            return false;
         }
      }
      if (iPlus2 < 8 && jMinus1 < 8 && iPlus2 >= 0 && jMinus1 >= 0) {
         if (matrix[iPlus2][jMinus1] == 1) {// System.out.println("3 condition");
            return false;
         }
      }
      if (iPlus2 < 8 && jPlus1 < 8 && iPlus2 >= 0 && jPlus1 >= 0) {
         if (matrix[iPlus2][jPlus1] == 1) {// System.out.println("4 condition");
            return false;
         }
      }
      if (iMinus1 < 8 && jMinus2 < 8 && iMinus1 >= 0 && jMinus2 >= 0) {
         if (matrix[iMinus1][jMinus2] == 1) {// System.out.println("5 condition");
            return false;
         }
      }
      if (iMinus1 < 8 && jPlus2 < 8 && iMinus1 >= 0 && jPlus2 >= 0) {
         if (matrix[iMinus1][jPlus2] == 1) {// System.out.println("6 condition");
            return false;
         }
      }

      if (iPlus1 < 8 && jMinus2 < 8 && iPlus1 >= 0 && jMinus2 >= 0) {
         if (matrix[iPlus1][jMinus2] == 1) {// System.out.println("7 condition");
            return false;
         }
      }

      if (iPlus1 < 8 && jPlus2 < 8 && iPlus1 >= 0 && jPlus2 >= 0) {
         if (matrix[iPlus1][jPlus2] == 1) {// System.out.println("8 condition");
            return false;
         }
      }

      return true;
   }

   public static void main(String[] args) {
      printMatrix(setTheHorses(generateMatrix()));
   }
}