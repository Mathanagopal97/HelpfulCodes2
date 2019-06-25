

public class PlayerMovement {
	public static void MoveThePlayer(String[][] layout, int direction) {
		int playerRow = 0, playerCol = 0;
		boolean playerFound = false;
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (layout[i][j].equals("P")||layout[i][j].equals("PB")) {
					playerRow = i;
					playerCol = j;
					playerFound = true;
					break;
				}
			}
			if (playerFound)
				break;
		}
		if (direction == 0) {
			if (layout[playerRow - 1][playerCol].equals("e")) {
				layout[playerRow][playerCol] = "e";
				layout[playerRow - 1][playerCol]="P";
			}
		}
		else if(direction==1)
		{
			if (layout[playerRow + 1][playerCol].equals("e")) {
				layout[playerRow][playerCol] = "e";
				layout[playerRow + 1][playerCol]="P";
			}
		}
		else if(direction==2)
		{
			if (layout[playerRow][playerCol-1].equals("e")) {
				layout[playerRow][playerCol] = "e";
				layout[playerRow][playerCol-1]="P";
			}
		}
		else if(direction==3)
		{
			if (layout[playerRow][playerCol+1].equals("e")) {
				layout[playerRow][playerCol] = "e";
				layout[playerRow][playerCol+1]="P";
			}
		}

	}
	
	public static void PlaceTheBomb(String[][] layout) {
		boolean bombPlaced = false;
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (layout[i][j].equals("P")) {
					layout[i][j] = "PB";
					bombPlaced = true;
					break;
				}
			}
			if (bombPlaced)
				break;
		}
	}
	
	public boolean MovementOfPlayer(String[][] layout,String movement) {
		movement = movement.toLowerCase();
		switch (movement) {
		case "w":
			MoveThePlayer(layout, 0);
			return true;
		case "s":
			MoveThePlayer(layout, 1);
			return true;
		case "a":
			MoveThePlayer(layout, 2);
			return true;
		case "d":
			MoveThePlayer(layout, 3);
			return true;
		case "b": PlaceTheBomb(layout);
			return true;
		default:
			return false;
		}
	}
	
	public void display(String[][] layout) {
		for(int i=0;i<12;i++)
		{
			for(int j=0;j<12;j++)
			{
				System.out.print(layout[i][j]+"  ");
			}
			System.out.println();
		}
	}

}

