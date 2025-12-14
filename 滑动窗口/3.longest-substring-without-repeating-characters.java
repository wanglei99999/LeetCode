/*
 * @lc app=leetcode.cn id=3 lang=java
 * @lcpr version=30204
 *
 * [3] 无重复字符的最长子串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
        int left=0;
        int right=0;
        int ans = 0;
        int[] cnt = new int[128];
        for(right=0;right<cs.length;right++){
            char c = cs[right];
            cnt[c]++;
            while(cnt[c]>1){
                cnt[cs[left]]--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        
        return ans;
    }
}
class MySolution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
        int left=0;
        int right=0;
        int ans = 0;
        char[] cs = s.toCharArray();
        while(right<cs.length){
            char cr = cs[right];
            right++;
            while(map.containsKey(cr)){
                char cl = cs[left];
                map.remove(cl);
                left++;
            }
            map.put(cr, 0);
            ans = Math.max(ans, map.size());
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcabcbb"\n
// @lcpr case=end

// @lcpr case=start
// "bbbbb"\n
// @lcpr case=end

// @lcpr case=start
// "pwwkew"\n
// @lcpr case=end

 */

