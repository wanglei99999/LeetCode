/*
 * @lc app=leetcode.cn id=70 lang=java
 * @lcpr version=30204
 *
 * [70] 爬楼梯
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int climbStairs(int n) {
        
        int a = 1, b  = 1;
        int c= 0 ;
        for(int i = 2;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return n<2?n:c;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

 */

