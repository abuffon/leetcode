package leetcode.algorithm.i;

public class SearchInsertPosition35 {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{1,3,5,6}, 5) == 2);
		System.out.println(searchInsert(new int[]{1,3,5,6}, 2) == 1);
		System.out.println(searchInsert(new int[]{1,3,5,6}, 7) == 4);
		System.out.println(searchInsert(new int[]{1,3,5,6}, 0) == 0);
		System.out.println(searchInsert(new int[]{1}, 0) == 0);
		System.out.println(searchInsert(new int[]{1}, 2) == 1);
		System.out.println(searchInsert(new int[]{1,3}, 2) == 1);

	}

	private static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0; 
        
        while (left < right) {
            index = left + (right - left) / 2;
            
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                right = index;
            } else {
                left = index + 1;
            }
            
            //System.out.println("i:" + index + " l:" + left + " r:" + right + " n[i]:" + nums[index]);
            if (left >= right && right == nums.length - 1 && target > nums[nums.length - 1]) 
                left++;
        }
        
        if (nums.length == 1) {
            if (nums[0] >= target)
                return 0;
            else 
                return 1;
        }
        
        
        return left;
    }
	
	private static int searchInsert2(int[] nums, int target) {
        int len = nums.length;
        int left, right;
        left = 0; 
        right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
