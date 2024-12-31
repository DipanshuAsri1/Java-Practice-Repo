package arraysProg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }


        // Step 1: Sort intervals by their start times
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        //int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};


        // Step 2: Use a list to store merged intervals
        List<int[]> merged = new ArrayList<>();

        // Step 3: Iterate through the intervals
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentStart = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currentEnd) { // Overlap condition
                // Merge the intervals by updating the end of the current interval
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the current interval to the result
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        // Convert the list to an array and return
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);

        // Print the result
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }

    }
}
