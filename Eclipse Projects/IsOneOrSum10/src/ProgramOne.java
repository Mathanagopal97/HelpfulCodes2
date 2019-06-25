public class ProgramOne {

	public static boolean isOneOrSum10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10)
			return true;
		else
			return false;
	}

	private static void TestingModule(int a, int b, boolean expected, ProgramOne isOneOrSum10) {
		boolean actual = isOneOrSum10(a, b);
		if (expected == actual)
			System.out.println("Pass");
		else 
			System.out.println("Fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramOne TestObj = new ProgramOne();
		TestingModule(1,1,false,TestObj);
		TestingModule(10,1,true,TestObj);
		TestingModule(1,10,true,TestObj);
		TestingModule(5,5,true,TestObj);
		TestingModule(5,6,false,TestObj);
		TestingModule(10,1,true,TestObj);
	}

}
