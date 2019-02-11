import java.util.ArrayList;
import java.util.Scanner;

public class LogicClass {

	public static ArrayList<Integer> generatePrimes(int n) {

		boolean prime[] = new boolean[n + 1];
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				answer.add(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listOfPrimes = generatePrimes(10000);
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		while (times > 0) {
			int n = sc.nextInt();
			boolean condition = false;
			int ctr = 0;
			do {
				int a = listOfPrimes.get(ctr);
				int diff = n - a;
				if (listOfPrimes.contains(diff)) {
					condition = true;
					System.out.println(a + " " + diff);
				} else
					ctr++;
			} while (!condition);
			times--;

		}
		sc.close();
	}

}
