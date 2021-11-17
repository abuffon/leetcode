package leetcode.algorithm.i;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

	/*
   	 	You are given an m x n grid where each cell can have one of three values:

		0 representing an empty cell,
		1 representing a fresh orange, or
		2 representing a rotten orange.
		Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
		
		Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
		
		Example 1:
		Input: grid = [[2,1,1],
					   [1,1,0],
					   [0,1,1]]
		Output: 4
		
		Example 2:
		Input: grid = [[2,1,1],
					   [0,1,1],
					   [1,0,1]]
		Output: -1
		Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
		
		Example 3:
		Input: grid = [[0,2]]
		Output: 0
		Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
	 */
	
	public static int orangesRotting(int[][] grid) {
		Queue<Pair> rotes = new LinkedList<Pair>();
		
		for (int m = 0; m < grid.length; m++) {
			for (int n = 0; n < grid[m].length; n++) {
				if (grid[m][n] == 2) {
					rotes.add(new Pair(m, n, 0));
				}
			}
		}
		
		int minutes = 0;
		while (rotes.size() > 0) {
			Pair pair = rotes.poll();
			minutes = pair.minute;
			rotting(grid, pair.m, pair.n, pair.minute, rotes);
		}
		
		for (int m = 0; m < grid.length; m++) {
			for (int n = 0; n < grid[m].length; n++) {
				if (grid[m][n] == 1) {
					return -1;
				}
			}
		}
		
        return minutes;
    }

	private static void rotting(int[][] grid, int m, int n, int minute, Queue<Pair> rotes) {
		if ((m-1) >= 0 && grid[m-1][n] == 1) {
			grid[m-1][n] = 2;
			rotes.add(new Pair(m-1, n, minute+1));
		} 
		if ((m+1) < grid.length && grid[m+1][n] == 1) { 
			grid[m+1][n] = 2;
			rotes.add(new Pair(m+1, n, minute+1));
		}
		if ((n-1) >= 0 && grid[m][n-1] == 1) {
			grid[m][n-1] = 2;
			rotes.add(new Pair(m, n-1, minute+1));
		} 
		if ((n+1) < grid[m].length && grid[m][n+1] == 1) {
			grid[m][n+1] = 2;
			rotes.add(new Pair(m, n+1, minute+1));
		}
	}
}
