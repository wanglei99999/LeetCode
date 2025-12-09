/*
 * @lc app=leetcode.cn id=2090 lang=java
 * @lcpr version=30204
 *
 * [2090] 半径为 k 的子数组平均值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        long cur = 0;
        int right = 0;
        for(;right<nums.length;right++){
            cur+=nums[right];
            if(right<2*k){
                continue;
            }
            
            arr[right-k]= (int)cur/(2*k+1);
            cur-=nums[right-(2*k+1)+1];

        }
        return arr;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,4,3,9,1,8,5,2,6]\n3\n
// @lcpr case=end

// @lcpr case=start
// [100000]\n0\n
// @lcpr case=end

// @lcpr case=start
// [8]\n100000\n
// @lcpr case=end

 */

