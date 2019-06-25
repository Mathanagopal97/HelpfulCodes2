
public class LogicClass {
	public boolean multipleOf3Or5Only(int n) {
		if(n%3==0 && n%5==0) return false;
		else if(n%3==0 || n%5==0) return true;
		return false;
	    // your code here
	}
	
	public static void TestModule(int n,boolean expected)
	{
		LogicClass lc = new LogicClass();
		boolean actual = lc.multipleOf3Or5Only(n);
		if(actual==expected) System.out.println("pass");
		else System.out.println("pass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestModule(25,true);
		TestModule(26,false);
		TestModule(15,false);
		TestModule(6,true);

	}

}
