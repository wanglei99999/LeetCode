/*
 * @lc app=leetcode.cn id=1493 lang=java
 * @lcpr version=30204
 *
 * [1493] 删掉一个元素以后全为 1 的最长子数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int left = 0;
        int right=0;
        int ans = 0;
        int cur = 0;
        while(right<nums.length){
            int ir = nums[right];
            right++;
            cur++;
            count+=1-ir;
            while(count>1){
                if(nums[left]==0)
                    count--;
                left++;
                cur--;
            }
            ans = Math.max(ans, cur);
        }   
        return ans-1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,1,1,0,1,1,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1]\n
// @lcpr case=end

 */

