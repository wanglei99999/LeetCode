/*
 * @lc app=leetcode.cn id=1208 lang=java
 * @lcpr version=30204
 *
 * [1208] 尽可能使字符串相等
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int ans = 0;
        int right = 0;
        int left = 0;
        int len = sArr.length;
        int cur = 0;
        while(right<len){
            int sc = sArr[right];
            int tc = tArr[right];
            cur += Math.abs(sc-tc);
            right++;
            while(cur>maxCost){
                int sl = sArr[left];
                int tl = tArr[left];
                cur -= Math.abs(sl-tl);
                left++;
            }
            ans = Math.max(ans, right-left);
        }
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcd"\n"bcdf"\n3\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n"cdef"\n3\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n"acde"\n0\n
// @lcpr case=end

 */

