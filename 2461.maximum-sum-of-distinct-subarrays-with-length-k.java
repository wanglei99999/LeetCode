/*
 * @lc app=leetcode.cn id=2461 lang=java
 * @lcpr version=30204
 *
 * [2461] 长度为 K 子数组中的最大和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.Map;
import java.util.HashMap;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int right = 0;
        long curSum = 0;
        for(;right<nums.length;right++){
            int nr = nums[right];
            curSum+=nr;
            if(map.containsKey(nr)){
                map.put(nr, map.get(nr)+1);
            }else{
                map.put(nr, 1);
            }
            int left = right-k+1;
            if(left<0)
                continue;
            if(map.size()==k){
                ans = Math.max(ans,curSum);
            }
            int nl = nums[left];
            curSum-=nl;
            if(map.get(nl)==1){
                map.remove(nl);
            }else{
                map.put(nl,map.get(nl)-1);
            }
        }


        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,5,4,2,9,9,9]\n3\n
// @lcpr case=end

// @lcpr case=start
// [4,4,4]\n3\n
// @lcpr case=end

 */

