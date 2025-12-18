/*
 * @lc app=leetcode.cn id=904 lang=java
 * @lcpr version=30204
 *
 * [904] 水果成篮
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        Map<Integer,Integer> map = new HashMap();
        int n = fruits.length;
        int right = 0;
        int left =0;
        while(right<n){
            int i = fruits[right];
            right++;
            map.merge(i,1,Integer::sum);
            
            while(map.size()>2){
                int il = fruits[left];
                left++;
                map.merge(il, -1, Integer::sum);
                if(map.get(il)==0)
                    map.remove(il);
            }
            ans = Math.max(ans, right-left);
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,3,3,1,2,1,1,2,3,3,4]\n
// @lcpr case=end

 */

