import java.util.*;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> special = new HashSet<>();

        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                if(set.contains(nums[i])) {
                    special.add(nums[i]);
                }
                set.add(nums[i]);
            }
        }

        return set.size() - special.size();
    }
}

        