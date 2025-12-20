/*
 * @lc app=leetcode.cn id=2024 lang=java
 * @lcpr version=30204
 *
 * [2024] 考试的最大困扰度
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        int right = 0;
        int left = 0;
        char[] arr = answerKey.toCharArray();
        for(;right<arr.length;right++){
            char cr = arr[right];
            map.merge(cr, 1, Integer::sum);
            
            while(map.getOrDefault('T', 0)>k&&map.getOrDefault('F',0)>k){
                char cl = arr[left];
                left++;
                map.merge(cl, -1, Integer::sum);
            }
            ans = Math.max(ans, right-left+1);
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "TTFF"\n2\n
// @lcpr case=end

// @lcpr case=start
// "TFFT"\n1\n
// @lcpr case=end

// @lcpr case=start
// "TTFTTFTT"\n1\n
// @lcpr case=end

 */

