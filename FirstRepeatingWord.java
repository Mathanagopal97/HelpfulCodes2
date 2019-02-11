import java.util.*;

class FirstRepeatingWord {
	private static boolean compareTwoString(String str1, String str2)
	{
		if(str1.length()!= str2.length()) return false;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line");
		String input = sc.nextLine();
		int strlen = input.length(), spaceCount = 0;
		for (int i = 0; i < strlen; i++)
			if (input.charAt(i) == ' ')
				spaceCount++;
		String[] data = new String[spaceCount + 1];
		int k = 0;
		String concatStr = "";
		for (int i = 0; i < strlen; i++) {
			if (input.charAt(i) != ' ')
				concatStr = concatStr + input.charAt(i);
			if (input.charAt(i) == ' ' || i == strlen - 1) {
				data[k] = concatStr;
				concatStr = "";
				k++;
			}
		}
		int flag=0;
		for (int i = 0; i < spaceCount + 1; i++) {
			String repeatingWord = data[i];
			for (int j = i + 1; j < spaceCount + 1; j++) {
				if (compareTwoString(repeatingWord,data[j])) {
					System.out.println(repeatingWord);
					System.exit(0);
				}
			}
		}
		if(flag==0) System.out.println("There is no repeating words in the sentence");
		sc.close();
	}
}