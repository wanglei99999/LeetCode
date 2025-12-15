/*
 * @lc app=leetcode.cn id=3634 lang=java
 * @lcpr version=30204
 *
 * [3634] 使数组平衡的最少移除数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minRemoval(int[] nums, int k) {
        int ans = 0;
        if(nums.length<=1)
            return 0;
        Arrays.sort(nums);
        int right=0;
        int left = 0;
        
        for(;right<nums.length;right++){
            while(nums[right]>nums[left]){
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return nums.length-ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,5]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,6,2,9]\n3\n
// @lcpr case=end

// @lcpr case=start
// [4,6]\n2\n
// @lcpr case=end

 */

