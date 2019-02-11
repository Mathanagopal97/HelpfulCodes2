
public class LogicClass {
	public static boolean nearHundred(int a) {
		// your code here
		int diff1 = Math.abs(100 - a);
		int diff2 = Math.abs(200 - a);
		if (diff1 <= 10 || diff2 <= 10)
			return true;
		else
			return false;
	}

	public static void TestModule(int n, boolean expected) {
		boolean actual = nearHundred(n);
		if (actual == expected)
			System.out.println("pass");
		else
			System.out.println("fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestModule(93, true);
		TestModule(90, true);
		TestModule(89, false);
		TestModule(110, true);
		TestModule(209, true);
		TestModule(250, false);
		TestModule(211, false);
		TestModule(111,false);

	}

}
