import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(ProgramOne.isOneOrSum10(a,b));
		sc.close();

	}

}
