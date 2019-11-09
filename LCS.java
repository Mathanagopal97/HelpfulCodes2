public class LCS
{
	public static void main(String[] args) {
		String seq1 = "GXTXAYB"; //AGGTAB
		String seq2 = "AGGTAB";
		
		String finalSeq = "";
		for(int i=0;i<seq1.length();i++){
		    char ch = seq1.charAt(i);
		    for(int j=0;j<seq2.length();j++){
		        if(ch==seq2.charAt(j)){
		            finalSeq = finalSeq + ch;
		            seq2 = seq2.replaceFirst(""+ch,"").trim();
		            break;
		        }
		    }
		}
		System.out.println(finalSeq + " length = "+finalSeq.length());
	}
}
