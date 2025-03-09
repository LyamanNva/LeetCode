import java.util.*;
//HashMap O(n) Brute Force O(n^2)
class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (map.containsKey(a)) {
                return new int[]{map.get(a), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

