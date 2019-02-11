import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Implementaion {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		int count = 10000000;
		int nof6 = 0, nof9 = 0, nofc6 = 0, nofc9 = 0;
		for (int i = 0; i < count; i++) {
			int n = rand.nextInt(100) + 1;
			numbers.add(n);
		}
		long nof6stream = numbers.parallelStream().filter(n -> n == 6).count();
		long nof9stream = numbers.stream().filter(n -> n == 9).count();
		System.out.println("nof6stream = " + nof6stream);
		System.out.println("nof9stream = " + nof9stream);
		long startTime = System.currentTimeMillis();
		IntStream.range(1,100000).filter(a->a%2==0).count();
		long endTime = System.currentTimeMillis();
		/*
		 * Iterator<Integer> itr = numbers.iterator(); int ctr1 = 0; while
		 * (itr.hasNext()) { System.out.print(itr.next() + ","); ctr1++; if (ctr1 == 40)
		 * { System.out.println(); ctr1 = 0; } }
		 */

		// Calculation for consecutive sixes
		for (int i = 0; i < count - 1; i++) {
			int ctr = 1;
			int flag = 0;
			if (numbers.get(i) == 6) {
				// System.out.println(numbers.get(i)+" "+(i));
				nofc6++;
				if (i + ctr < count) {
					while (ctr + i != count && numbers.get(ctr + i) == 6) {
						if (numbers.get(ctr + i) == 6) {
							// System.out.println(numbers.get(ctr+i)+" "+(ctr+i));
							nofc6++;
							flag = 1;
						}
						ctr++;
					}
					i = i + ctr - 1;
					// System.out.println(i + "-i and ctr-" + ctr);
					if (flag == 0)
						nofc6--;
				}
			}

		}

		// Calculation for consecutive nines
		for (int i = 0; i < count - 1; i++) {
			int ctr = 1;
			int flag = 0;
			if (numbers.get(i) == 9) {
				// System.out.println(numbers.get(i)+" "+(i));
				nofc9++;
				if (i + ctr < count) {
					while (ctr + i != count && numbers.get(ctr + i) == 9) {
						if (numbers.get(ctr + i) == 9) {
							// System.out.println(numbers.get(ctr+i)+" "+(ctr+i));
							nofc9++;
							flag = 1;
						}
						ctr++;
					}
					i = i + ctr - 1;
					// System.out.println(i + "-i and ctr-" + ctr);
					if (flag == 0)
						nofc9--;
				}
			}

		}
		
		long runtime = endTime - startTime;
		System.out.println("Runtime(ms)For Stream : " + runtime + " ms");
		startTime = System.currentTimeMillis();
		int count1=0;
		for(int i=1;i<100000;i++) if(i%2==0) count1++;
		endTime = System.currentTimeMillis();
		runtime = endTime - startTime;
		System.out.println("Runtime(ms) : " + runtime + " ms");
		System.out.println("Number of consecutive sixes = " + nofc6);
		System.out.println("Number of consecutive nines = " + nofc9);
		

		
		// System.out.println("Runtime(s) : " + runtime / 1000 + " s");
	}
}
