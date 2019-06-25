import java.util.Scanner;

public class BomFixing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BomberLayout bl = new BomberLayout();
		String [][] layout = bl.getLayout();
		PlayerMovement pm = new PlayerMovement();
		pm.display(layout);
		int times = 2;
		Scanner sc = new Scanner(System.in);
		while(times>0)
		{
			System.out.println("Enter an alphabet.(w,s,a,d,b)");
			String movement = sc.next();
			if(pm.MovementOfPlayer(layout, movement)) {
				System.out.println("Player Moved Successfully");
				times--;
				pm.display(layout);
				System.out.println("\n\n");
			}
			else {
				System.out.println("Player not moved!!");
			}
		}
		sc.close();


	}

}
