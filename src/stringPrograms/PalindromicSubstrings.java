package stringPrograms;

public class PalindromicSubstrings {

    public int countPalindromicSubstrings(String s) {
        int totPalindromes=0;

        for(int i=0;i<s.length();i++){
            totPalindromes+=expandArounCenter(s,i,i ); //odd
            totPalindromes+=expandArounCenter(s,i,i ); //odd
        }

        return totPalindromes;
    }

    private int expandArounCenter(String s, int left, int right) {

        int count =0;
        while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
           count++;
           left--;
           right++;
        }

        return count;
    }

    public static void main(String[] args) {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String s = "aba";
        System.out.println(solution.countPalindromicSubstrings(s));  // Output: 3
    }
}
