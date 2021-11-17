package leetcode.algorithm.i;

public class BinarySearch704 {

	public static void main(String[] args) {
		System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
		System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
		System.out.println(search(new int[]{-1,0,3,5,9,12,13,14,15,16,17,18,19,20,221}, 20));
		System.out.println(search(new int[]{-1,0,3,5,9,12,13,14,15,16,17,18,19,20,221}, 201));
	}

	public static int search(int[] nums, int target) {
        int pivot = 0, left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
        	//pivot = (left + right) / 2;
        	pivot = left + (right - left) / 2;
        	
        	if (nums[pivot] ==  target) {
        		return pivot;
        	} else if (nums[pivot] <  target) {
        		left = pivot + 1;
        	} else if (nums[pivot] >  target) {
        		right = pivot - 1;
        	}
        }
        
        return -1;
    }
}
