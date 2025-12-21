/*
 * @lc app=leetcode.cn id=1004 lang=java
 * @lcpr version=30204
 *
 * [1004] 最大连续1的个数 III
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0 ;
        int[] arr = new int[2];
        Arrays.fill(arr,0);

        int right = 0;
        int left = 0;
        while(right<nums.length){
            int nr = nums[right];
            right++;
            arr[nr]++;
            while(nr==0&&arr[nr]>k){
                int nl = nums[left];
                left++;
                arr[nl]--;
            }
            ans = Math.max(ans, right-left);
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,1,0,0,0,1,1,1,1,0]\n2\n
// @lcpr case=end

// @lcpr case=start
// [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1]\n3\n
// @lcpr case=end

 */

