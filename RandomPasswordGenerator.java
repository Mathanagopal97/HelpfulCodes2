import java.util.*;

public class RandomPasswordGenerator
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of the password");
		int len = sc.nextInt();
      String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
      String spaces = " ";
      String values = Capital_chars + Small_chars + numbers + symbols;
		Random rndm = new Random();
		char[] password = new char[len];
		for (int i = 0; i < len; i++)
		{
			password[i] = values.charAt(rndm.nextInt(values.length()));

		}
      System.out.println(password);
	}

}
