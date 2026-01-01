/*
 * @lc app=leetcode.cn id=746 lang=java
 * @lcpr version=30204
 *
 * [746] 使用最小花费爬楼梯
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2;i<n+1;i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }

    public int minCostClimbingStairs1(int[] cost) {
        int n = cost.length;
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        int ans = dp(cost, n,arr);
        return ans;
    }
    private int dp(int[] cost,int i,int[] arr){
        if(i<2)
            return 0;
        if(arr[i]!=-1)
            return arr[i];
        return arr[i]=Math.min(dp(cost, i-1,arr)+cost[i-1],dp(cost, i-2,arr)+cost[i-2]);
    }
}


// @lc code=end



/*
// @lcpr case=start
// [10,15,20]\n
// @lcpr case=end

// @lcpr case=start
// [1,100,1,1,1,100,1,1,100,1]\n
// @lcpr case=end

 */

