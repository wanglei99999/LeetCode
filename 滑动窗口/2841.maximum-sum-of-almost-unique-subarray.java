/*
 * @lc app=leetcode.cn id=2841 lang=java
 * @lcpr version=30204
 *
 * [2841] 几乎唯一子数组的最大和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int right = 0;
        Map<Integer,Integer> map = new HashMap<>();
        long res = 0;
        long sum = 0;
        for(;right<nums.size();right++){
            int n = nums.get(right);
            sum+=n;
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }else{
                map.put(n, 1);
            }
            int left = right-k+1;
            if(left<0)
                continue;
            if(map.size()>=m)
                res = Math.max(sum,res);
            int nl = nums.get(left);
            int c = map.get(nl);
            if(c>1){
                map.put(nl,c-1);
            }else{
                map.remove(nl);
            }
            sum-=nl;
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,6,7,3,1,7]\n3\n4\n
// @lcpr case=end

// @lcpr case=start
// [5,9,9,2,4,5,4]\n1\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,1,2,1,2,1]\n3\n3\n
// @lcpr case=end

 */

