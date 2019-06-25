import java.util.Random;

public class BomberLayout {
 private static String[][] layout = new String[12][12];

	private static void PlaceInsideTheGrid(String[][] layout, String element, int count) {
		Random rand = new Random();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				int rowNum = rand.nextInt(11) + 0;
				int colNum = rand.nextInt(11) + 0;
				if (layout[rowNum][colNum].equals("e")) {
					layout[rowNum][colNum] = element;
					count--;
				}
				if (count == 0)
					break;
			}
			if (count == 0)
				break;
		}
	}
	
	private static void PlaceTheVillain(String[][] layout)
	{
		int count=1;
		Random rand = new Random();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				int rowNum = rand.nextInt(11) + 0;
				int colNum = rand.nextInt(11) + 0;
				if (layout[rowNum][colNum].equals("e")) {
					if(layout[rowNum][colNum-1].equals("P") || layout[rowNum][colNum+1].equals("P") || 
							layout[rowNum-1][colNum-1].equals("P") || layout[rowNum+1][colNum-1].equals("P")
							|| layout[rowNum-1][colNum+1].equals("P") || layout[rowNum+1][colNum+1].equals("P")
							|| layout[rowNum-1][colNum].equals("P") || layout[rowNum+1][colNum].equals("P")) {
						
					}
					else{
						layout[rowNum][colNum] = "V";
						count--;
					}
				}
				if (count == 0)
					break;
			}
			if (count == 0)
				break;
		}
	}
	
	public String[][] getLayout()
	{
		Random rand = new Random();
		// Including border wall and empty spaces
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (i == 0 || j == 0)
					layout[i][j] = "W";
				else if (i == 11 || j == 11)
					layout[i][j] = "W";
				else
					layout[i][j] = "e";
			}
		}

		// Including walls inside the grid
		PlaceInsideTheGrid(layout,"W",6);

		// Placing bricks inside the grid
		PlaceInsideTheGrid(layout,"B",8);
		
		//Placing the player inside the grid
		boolean playerFixed = false;
		while (!playerFixed) {
			int rowNum = rand.nextInt(11) + 0;
			int colNum = rand.nextInt(11) + 0;
			if (layout[rowNum][colNum].equals("e")) {
				layout[rowNum][colNum] = "P";
				playerFixed = true;
			}
		}
		
		//Placing the villain in the grid
		PlaceTheVillain(layout);
		
		return layout;
		
	}


}
