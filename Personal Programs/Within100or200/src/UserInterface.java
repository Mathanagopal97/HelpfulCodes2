import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(LogicClass.nearHundred(n));
		sc.close();
	}
}
