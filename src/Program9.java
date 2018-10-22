
public class Program9 {
	public static void main(String[] args) {
		String s1="AGGTAB";
		String s2="GXTXAYB";
		longestCommonSubSeq(s1,s2);
	}

	private static void longestCommonSubSeq(String s1, String s2) {
		int count=0;
		
		for (int i = 0; i < s1.length(); i++) {
			int temp=0;
			for (int j = temp; j < s2.length(); j++) {
				if(s1.charAt(i)==s2.charAt(j)){
					count++;
					temp++;
					continue;
				}
			}
			temp=0;
		}
		System.out.println(count);
	}
}
