/*
 * @lc app=leetcode.cn id=643 lang=java
 * @lcpr version=30204
 *
 * [643] 子数组最大平均数 I
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double d  = -1*Math.pow(10,4);
        int right = 0;
        double cur = 0;
        for(;right<nums.length;right++){
            cur+=nums[right];
            //d = Math.max(d,cur/Math.min(k,right+1));
            int left = right-k+1;
            if(left<0)
                continue;
            d = Math.max(d,cur/k);
            cur-=nums[left];
        }
        return d;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,12,-5,-6,50,3]\n4\n
// @lcpr case=end

// @lcpr case=start
// [5]\n1\n
// @lcpr case=end

 */

