
public class LogicClass {

	static int totalArrangement;
	static int timesSwapped = 0;

	private static void MainLogic(String[] input, int start, int end) {
		if (start == end) {
			timesSwapped++;
			boolean flag = stringComparision(input);
			if (flag) {
				System.out.println("Found");
				for (String str : input)
					System.out.print(str + " ");
				System.out.println();
				System.exit(0);
			} else {
				if (totalArrangement == timesSwapped)
					System.out.println("Not found");
			}
		} else {
			for (int i = start; i <= end; i++) {
				input = swap(input, start, i);
				MainLogic(input, start + 1, end);
				input = swap(input, start, i);
			}
		}
	}

	public static String[] swap(String[] input, int start, int end) {
		String temp;
		temp = input[start];
		input[start] = input[end];
		input[end] = temp;
		return input;
	}

	public static int factorial(int number) {
		if (number <= 1)
			return 1;
		else
			return number * factorial(number - 1);
	}

	private static int compareTwoString(String str1, String str2) {
		int count = 0;
		if (str1.length() != str2.length())
			return 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i))
				count++;
		}
		return count;
	}

	private static boolean stringComparision(String[] input) {
		int flag = 0;
		for (int i = 0; i < input.length - 1; i++) {
			String cmp1 = input[i];
			String cmp2 = input[i + 1];
			if (compareTwoString(cmp1, cmp2) == 1) {
				flag++;
			}
		}
		if (flag == input.length - 1)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "aba", "bbb", "bab" };
		String[] input2 = { "ab", "bb", "aa" };
		String[] input3 = { "abaa", "bbbb", "baba", "aabb" };
		totalArrangement = factorial(input.length);
		MainLogic(input, 0, input.length - 1);
		totalArrangement = factorial(input3.length);
		timesSwapped = 0;
		MainLogic(input3, 0, input3.length - 1);
		totalArrangement = factorial(input2.length);
		timesSwapped = 0;
		MainLogic(input2, 0, input2.length - 1);
	}

}
