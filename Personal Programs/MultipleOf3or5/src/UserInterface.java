import java.util.*;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		LogicClass lc = new LogicClass();
		if(lc.multipleOf3Or5Only(n)) System.out.println("The number is divisible by 3 0r 5 and not both");
		else System.out.println("The number is not divisible by 3 or 5 and maybe divisible by both");
		sc.close();

	}

}
