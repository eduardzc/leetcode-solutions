package leetcode;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] prueba = {1, 5, 6, 8};
		int target = 9;
		
		int[] res = twoSum(prueba, target);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
    	int[] indexes = {-1, -1};
    	
        for (int i = 0; i < nums.length; i++) {
        	for(int j = i+1; j < nums.length; j++) {
        		if(nums[i] + nums[j] == target) {
        			indexes[0] = i;
        			indexes[1] = j;
        			return indexes;
        		}
        	}
        }
        return indexes;
    }
}
