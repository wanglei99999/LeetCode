/*
 * @lc app=leetcode.cn id=2379 lang=java
 * @lcpr version=30204
 *
 * [2379] 得到 K 个黑块的最少涂色次数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int right = 0;
        int cur = 0;
        int res = blocks.length()+1;
        char[] cs = blocks.toCharArray();
        for(;right<cs.length;right++){
            if(cs[right]=='W')
                cur++;
            int left = right-k+1;
            if(left<0)
                continue;
            res = Math.min(res,cur);
            if(cs[left]=='W')
                cur--;

        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "WBBWWBBWBW"\n7\n
// @lcpr case=end

// @lcpr case=start
// "WBWBBBW"\n2\n
// @lcpr case=end

 */

