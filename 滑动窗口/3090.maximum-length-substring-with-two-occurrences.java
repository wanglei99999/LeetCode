/*
 * @lc app=leetcode.cn id=3090 lang=java
 * @lcpr version=30204
 *
 * [3090] 每个字符最多出现两次的最长子字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int left = 0;
        int right = 0;
        int cur = 0;
        char[] sArr = s.toCharArray();
        while(right<sArr.length){
            char c = sArr[right];
            cur++;
            right++;
            map.merge(c,1,Integer::sum);
            
            while(map.get(c)>2){
                char cl =sArr[left];
                map.merge(cl, -1, Integer::sum);
                left++;
                cur--;
            }
            ans = Math.max(ans,cur);
        }
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "bcbbbcba"\n
// @lcpr case=end

// @lcpr case=start
// "aaaa"\n
// @lcpr case=end

 */

