package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0)
 * (the maze can be thought of as a 2-dimensional plane).
 * The maze would be given in the form of a square matrix of order 'N' * 'N'
 * where the cells with value 0 represent the maze’s blocked locations
 * while value 1 is the open/available path that the rat can take to reach its destination.
 * The rat's destination is at ('N' - 1, 'N' - 1).
 * Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.
 * The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down) i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).
 * For Example:
 * Given a square matrix of size 4*4 (i.e. here 'N' = 4):
 * 1 0 0 0
 * 1 1 0 0
 * 1 1 0 0
 * 0 1 1 1
 * Expected Output:
 * DDRDRR DRDDRR
 * i.e. Path-1: DDRDRR and Path-2: DRDDRR
 **/
public class RatInAMaze {

    // Directions and their corresponding movement deltas
    private static final int [] rowMove={1,0,0,-1};
    private static final int[] colMove = {0, -1, 1, 0};
    private static final char[] directions = {'D', 'L', 'R', 'U'};

    // Function to find all paths from (0, 0) to (N-1, N-1)
    public static List<String> findPaths(int[][] arr) {
        List<String> result = new ArrayList<>();
        int n=arr.length;
        // Edge case: if start or end is blocked
        if(arr[0][0]==0 && arr[n-1][n-1]==0) return result;

        boolean[][] visited=new boolean[n][n];

        findPathsHelper(arr, 0, 0, n, visited, "", result);

        return result;
    }

    private static void findPathsHelper(int[][] arr, int x, int y, int n, boolean[][] visited, String path, List<String> result) {

        if(x==n-1 && y==n-1){
            result.add(path);
            return;
        }

        visited[x][y]=true;

        // Explore all four directions
        for (int i = 0; i < 4; i++) {
            int newRow = x + rowMove[i];
            int newCol = y + colMove[i];

            // Check if the next move is within bounds and on a valid cell
            if (isSafe(arr, newRow, newCol, n, visited)) {
                findPathsHelper(arr, newRow, newCol, n, visited,
                        path + directions[i], result);
            }
        }

        // Backtrack: unmark the cell as visited
        visited[x][y] = false;

    }


    private static boolean isSafe(int[][] maze, int x , int y , int n  , boolean[][] visited){
        return ( x>=0 && x<n && y>=0 && y<n && maze[x][y]==1 && !visited[x][y]);
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        List<String> paths = findPaths(maze);
        if (paths.isEmpty()) {
            System.out.println("No path found");
        } else {
            System.out.println("All possible paths: ");
            for (String path : paths) {
                System.out.println(path);
            }
        }

    }
}
