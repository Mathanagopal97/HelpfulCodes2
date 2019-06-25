
public class NotAStringImplimentation {

	public static String notAString(String str) {
		String check = "";
		if(str.length()>=4) check = check+str.charAt(0)+str.charAt(1)+str.charAt(2)+str.charAt(3);
		if(check.equals("not ")) return str;
		else return "not "+str;
	}
	
	private static void TestMethod(String str, String expected)
	{
		String actual = notAString(str);
		if(actual.equals(expected)) System.out.println("Pass");
		else System.out.println("Fail");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod("going to happen","not going to happen");
		TestMethod("a","not a");
		TestMethod("not interested","not interested");

	}

}
