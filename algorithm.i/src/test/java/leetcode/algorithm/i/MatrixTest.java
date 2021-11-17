package leetcode.algorithm.i;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatrixTest {

	@Test
	void test1() {
		int[][] mat = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 }, { 1, 1, 1 } };
		mat = Matrix.updateMatrix(mat);
		assertArrayEquals(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 2, 1 }, { 2, 3, 2 } }, mat);
	}
	
	@Test
	void test2() {
		int[][] mat = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		mat = Matrix.updateMatrix(mat);
		assertArrayEquals(new int[][] { { 2, 2, 2 }, { 1, 1, 1 }, { 0, 0, 0 }, { 0, 1, 0 }, { 1, 2, 1 } }, mat);
	}
	
	@Test
	void test3() {
		int[][] mat = new int[][] { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 0 }, { 1, 1, 1 }, { 1, 1, 1 } };
		mat = Matrix.updateMatrix(mat);
		assertArrayEquals(new int[][] { { 4, 3, 2 }, { 3, 2, 1 }, { 2, 1, 0 }, { 3, 2, 1 }, { 4, 3, 2 } }, mat);
	}
}
