/*
 * @lc app=leetcode.cn id=1695 lang=java
 * @lcpr version=30204
 *
 * [1695] 删除子数组的最大得分
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashSet;
import java.util.Set;
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>(); 
        int right = 0;
        int left = 0;
        int cur = 0;

        while(right<nums.length){
            int nr = nums[right];
            right++;
            while(set.contains(nr)){
                int nl = nums[left];
                left++;
                set.remove(nl);
                cur-=nl;
            }
            set.add(nr);
            cur+=nr;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,4,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [5,2,1,2,5,2,1,2,5]\n
// @lcpr case=end

 */

