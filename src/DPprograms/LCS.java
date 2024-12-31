package DPprograms;

public class LCS {

    // Function to find the longest common subsequence of two strings
    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 2D array to store lengths of LCS for substrings
        int[][] dp = new int[m + 1][n + 1];

        // Fill dp array from bottom-up
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0; // If one of the strings is empty, LCS is 0
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // If characters match, add 1 to LCS
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Otherwise, take the max from previous
                }
            }
        }

        // Return the length of LCS for the full strings
        return dp[m][n];
    }

    // Optional function to print the actual LCS
    public static String printLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create dp table as in the lcs() function
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Trace back through dp table to find the LCS
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1)); // If the characters match, it is part of the LCS
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--; // Move upwards in the dp array
            } else {
                j--; // Move leftwards in the dp array
            }
        }

        // LCS is constructed backwards, so reverse the string before returning
        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";

        // Find length of LCS
        int length = lcs(s1, s2);
        System.out.println("Length of LCS: " + length);

        // Print the actual LCS
        String lcsString = printLCS(s1, s2);
        System.out.println("Longest Common Subsequence: " + lcsString);
    }
}
