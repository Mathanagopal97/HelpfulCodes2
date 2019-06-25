import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LogicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> inputElements = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			int input = sc.nextInt();
			inputElements.add(input);
		}
		Collections.sort(inputElements);
		int arrsize = inputElements.get(size - 1);
		int[] arr = new int[arrsize];
		// for(int i:arr)System.out.print(i+" ");
		for (int i = 0; i < size; i++) {
			arr[inputElements.get(i) - 1] = arr[inputElements.get(i) - 1] + 1;
		}

		for (int i : arr)
			System.out.print(i + " ");
		sc.close();
	}

}
