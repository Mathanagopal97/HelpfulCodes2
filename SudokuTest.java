import java.util.Scanner;

public class SudokuTest {
public static void main(String args[]) {
int size,ind1,ind2,ind3,ind4;
Scanner scanner = new Scanner(System.in);
size = scanner.nextInt();
int puzzle[][] = new int[size][size];
for(ind1=0;ind1<size;ind1++) {
for(ind2=0;ind2<size;ind2++) {
puzzle[ind1][ind2]=scanner.nextInt();
}
}
Sudoku sudoku = new Sudoku(size,puzzle);
System.out.println(sudoku.checkSudoku());
}
}