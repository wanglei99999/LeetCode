/*
 * @lc app=leetcode.cn id=3693 lang=java
 * @lcpr version=30204
 *
 * [3693] 爬楼梯 II
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = costs[0]+1;
        dp[2] = Math.min(dp[1]+1,dp[0]+4)+costs[1];
        for(int i = 3;i<=n;i++){
            dp[i] = Math.min(Math.min(dp[i-1]+1, dp[i-2]+4), dp[i-3]+9)+costs[i];
        }
        return dp[n];
    }
    public int climbStairs1(int n, int[] costs) {
        int[]  memo  = new int[n+1];
        Arrays.fill(memo, -1);
        memo[0] = 0;
        return dp(n, costs,memo);     
    }
    private int dp(int i, int[] costs,int[] memo){
        if(i<=0)
            return 0;
        if(memo[i]!=-1)
            return memo[i];
        int res = Integer.MAX_VALUE;
        for(int j = Math.max(i-3,0);j<i;j++){
            res = Math.min(res,dp(j,costs,memo)+(i-j)*(i-j));
        }
        res +=costs[i-1];
        return memo[i] = res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n[1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[5,1,6,2]\n
// @lcpr case=end

// @lcpr case=start
// 3\n[9,8,3]\n
// @lcpr case=end

 */

