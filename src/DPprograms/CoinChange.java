package DPprograms;

import java.util.Arrays;

public class CoinChange {

    public static int minCoins(int[] coins, int amount) {
        // Create an array to store the minimum coins for each amount
        int[] dp = new int[amount + 1];
        // Fill the array with a large number (amount + 1)
        Arrays.fill(dp, amount + 1);
        System.out.println("dp[0] is: " +dp[0]+ " dp[1] " +dp[1]+ " dp[2] "+dp[2]);
        dp[0] = 0; // Base case: 0 coins needed to make amount 0

        // Iterate over each coin
        for (int coin : coins) {
            // Update the dp array for all amounts that can be made with the current coin
            for (int x = coin; x <= amount; x++) {
                dp[x] = Math.min(dp[x], dp[x - coin] + 1);
            }
        }

        // If dp[amount] is still amount + 1, it means it's not possible to make that amount
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; // Coin denominations
        int amount = 11; // Amount to be made

        int result = minCoins(coins, amount);
        if (result != -1) {
            System.out.println("Minimum coins needed: " + result);
        } else {
            System.out.println("Amount cannot be made with given coins.");
        }
    }
}
