
public class PosNegImplementation {
	public boolean posNeg(int a, int b, boolean negative) {
		// your code here
		if (negative) {
			if (a < 0 && b < 0)
				return true;
			else
				return false;
		} else {
			if (a < 0 && b > 0 || a > 0 && b < 0)
				return true;
			else
				return false;
		}
	}

	private static void TestModule(int a, int b, boolean negative, boolean expected) {
		PosNegImplementation posim = new PosNegImplementation();
		boolean actual = posim.posNeg(a, b, negative);
		if (actual == expected)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestModule(1, -1, false, true);// -> true
		TestModule(-1, 1, false, true);// -> true
		TestModule(1, 1, false, false);// -> false
		TestModule(-1, -1, false, false);// -> false

		TestModule(-1, -1, true, true);// -> true
		TestModule(-1, 1, true, false);// -> false
		TestModule(1, 1, true, false);// -> false

	}

}
