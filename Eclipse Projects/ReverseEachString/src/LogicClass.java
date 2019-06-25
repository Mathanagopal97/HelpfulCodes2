import java.util.*;

public class LogicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int len = input.length();
		int dotCount = 0;
		for (int i = 0; i < len; i++)
			if (input.charAt(i) == '.')
				dotCount++;
		String tstcase = "";
		for (int i = 0; i < len; i++) {
			if (input.charAt(i) != '.')
				tstcase = tstcase + input.charAt(i);
			if (input.charAt(i) == '.' || i == len - 1) {
				char[] try1 = tstcase.toCharArray();
				tstcase = "";
				for (int j = try1.length - 1; j >= 0; j--)
					System.out.print(try1[j]);
				if (dotCount >= 1)
					System.out.print(".");
				dotCount--;
			}
		}
		sc.close();
	}
}
