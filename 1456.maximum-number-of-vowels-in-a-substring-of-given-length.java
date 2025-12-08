/*
 * @lc app=leetcode.cn id=1456 lang=java
 * @lcpr version=30204
 *
 * [1456] 定长子串中元音的最大数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;int right = k-1;
        int res = 0;
        int cur = 0;
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i = 0;i<k&&s.length()>i;i++){
            char c  = s.charAt(i);
            if(set.contains(c)){
                cur++;
            }
        }
        res = Math.max(res,cur);
        while(right<s.length()-1){
            if(set.contains(s.charAt(left))){
                cur--;
            }
            left++;
            right++;
            if(set.contains(s.charAt(right))){
                cur++;
            }
            res = Math.max(res,cur);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abciiidef"\n3\n
// @lcpr case=end

// @lcpr case=start
// "aeiou"\n2\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n3\n
// @lcpr case=end

// @lcpr case=start
// "rhythms"\n4\n
// @lcpr case=end

// @lcpr case=start
// "tryhard"\n4\n
// @lcpr case=end

 */

