/*
 * @lc app=leetcode.cn id=1658 lang=java
 * @lcpr version=30204
 *
 * [1658] 将 x 减到 0 的最小操作数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

//我的思路
class MySolution {
    public int minOperations(int[] nums, int x) {
        int ans = Integer.MAX_VALUE;
        int cur = 0;
        int right=0;
        int left =0;
        int sum = Arrays.stream(nums).sum();
        int target = sum-x;
        if(target<0)
            return -1;
        for(;right<nums.length;right++){
            int nr = nums[right];
            cur+=nr;
            while(cur>target){
                int nl = nums[left];
                left++;
                cur-=nl;
            }
            if (cur==target) {
                ans = Math.min(ans, nums.length-(right-left+1));
            }
            
        }

        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,4,2,3]\n5\n
// @lcpr case=end

// @lcpr case=start
// [5,6,7,8,9]\n4\n
// @lcpr case=end

// @lcpr case=start
// [3,2,20,1,1,3]\n10\n
// @lcpr case=end

 */

