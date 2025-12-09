/*
 * @lc app=leetcode.cn id=1343 lang=java
 * @lcpr version=30204
 *
 * [1343] 大小为 K 且平均值大于等于阈值的子数组数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int numArrays  = 0;
        int right = 0;
        double curSum = 0;
        for(;right<arr.length;right++){
            curSum+=arr[right];
            if(right<k-1){
                continue;
            }
            if(curSum/k>=threshold)
                numArrays++;
            curSum-=arr[right-k+1];
        }
        return numArrays;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,2,2,2,5,5,5,8]\n3\n4\n
// @lcpr case=end

// @lcpr case=start
// [11,13,17,23,29,31,7,5,2,3]\n3\n5\n
// @lcpr case=end

 */

