package arraysProg;

/*
Problem Statement
A conveyor belt has packages that must be shipped from one port to another within B days.
The ith package on the conveyor belt has a weight of A[i].
Each day, we load the ship with packages on the conveyor belt (in the order given by weights).
We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages
on the conveyor belt being shipped within B days.
 */

/*
A = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] B = 5
Ans - 15
Explaination
we need to ship the packages within 5 days, so minimum capacity of ship we need is 15 because we will ship in following ways:
day 1 - [1, 2, 3, 4, 5] = total weight = 15
day 2- [6, 7], total weight = 13
day 3 - [8], total weight = 8
day 4 -[9], total weight = 9
day 5 -[10], total weight = 10
 */

/*
[3,2,2,4,1,4]
 */
public class ShipmentslogicLeetCode {

    static int shipWithinDays(int[] weights, int D) {

        int minCap = 0; //max of all weights
        int maxCap = 0; //sum of all weights

        for (int weight : weights) {
            minCap = Math.max(minCap, weight);
            maxCap += weight;
        }

        while (minCap < maxCap) {
            int mid = minCap + (maxCap - minCap);

            int days = 1;
            int sum = 0;

            //try to ship with mid capacity
            for (int weight : weights) {
                if (sum + weight > mid) {
                    days++;
                    sum = 0;
                }
                sum+= weight;
            }

            if (days > 0) {
                minCap = mid + 1;
            } else {
                maxCap = mid;
            }

        }
        return minCap;
    }


    public static void main(String[] args) {

        int arr[]={3,2,2,4,1,4};
        int max=shipWithinDays(arr,3);

        System.out.println("Max is "+max);

    }
}
