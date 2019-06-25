import java.util.*;

public class Sudoku {
int ind1, ind2, ind3, ind4, size, puzzle[][];

Sudoku(int size, int puzzle[][]) {
this.puzzle = puzzle;
this.size = size;
}

boolean checkSudoku() {
for(ind1=0;ind1<size;ind1++) {
HashSet<Integer> temp = new HashSet<Integer>();
for(ind2=0;ind2<size;ind2++) {
if(puzzle[ind1][ind2]<=0||puzzle[ind1][ind2]>size) {
return false;
}
temp.add(puzzle[ind1][ind2]);
}
if(temp.size()!=size) {
return false;
}
}
for(ind1=0;ind1<size;ind1++) {
HashSet<Integer> temp = new HashSet<Integer>();
for(ind2=0;ind2<size;ind2++) {
if(puzzle[ind2][ind1]<=0||puzzle[ind2][ind1]>size*size) {
return false;
}
temp.add(puzzle[ind2][ind1]);
}
if(temp.size()!=size*size) {
return false;
}
}
for(ind1=0;ind1<size;ind1+=size) {
for(ind2=0;ind2<size;ind2+=size) {
HashSet<Integer> temp = new HashSet<Integer>();
for(ind3=ind1;ind3<size+ind1;ind3++) {
for(ind4=ind2;ind4<size+ind2;ind4++) {
if(puzzle[ind3][ind4]<=0||puzzle[ind3][ind4]>size) {
System.out.println(5);
return false;
}
temp.add(puzzle[ind3][ind4]);
}
}
if(temp.size()!=size) {
return false;
}
}
}
return true;
}
}
