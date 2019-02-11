import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PosNegImplementation posim = new PosNegImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Negative perameter\nEnter 0 for false 1 for true");
		int inp = sc.nextInt();
		boolean negative;
		if (inp == 1)
			negative = true;
		else
			negative = false;
		System.out.println(posim.posNeg(a, b, negative));
		sc.close();
	}

}
