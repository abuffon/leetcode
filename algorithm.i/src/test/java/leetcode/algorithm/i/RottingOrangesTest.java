package leetcode.algorithm.i;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RottingOrangesTest {

	@Test
	void test1() {
		int[][] grid = new int[][] { {2,1,1}, {1,1,0}, {0,1,1}};
		int result = RottingOranges.orangesRotting(grid);
		
		assertEquals(4, result);
	}

	@Test
	void test2() {
		int[][] grid = new int[][] { {2,1,1}, {0,1,1}, {1,0,1}};
		int result = RottingOranges.orangesRotting(grid);
		
		assertEquals(-1, result);
	}
	
	@Test
	void test3() {
		int[][] grid = new int[][] { {0,2}};
		int result = RottingOranges.orangesRotting(grid);
		
		assertEquals(0, result);
	}
}
