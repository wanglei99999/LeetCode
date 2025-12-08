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

class mySolution {
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
            if(res == k)
                return res;
        }
        return res;
    }
}


class Solution{

    //这种滑动窗口是入（刚好满足条件）-》计算-》出（空了一个位置出来）的写法
    public int maxVowels(String s,int k){
        int res = 0;
        
        char[] cs= s.toCharArray();
        int right = 0;
        int cur = 0;
        for(;right<s.length();right++){
            if(cs[right] == 'a'||cs[right]=='e'||cs[right] == 'i'||cs[right] == 'o'||cs[right] == 'u')
                cur ++;
            //如何判断要不要+1，你只要去看你设置的区间是开闭，还是半开半闭,当前是闭区间[L,R],内部元素数量就是R-L+1；
            int left = right-k+1; 
            if(left<0)
                continue;
            res = Math.max(res,cur);  
            if (res==k) return res;
            if(cs[left] == 'a'||cs[left]=='e'||cs[left] == 'i'||cs[left] == 'o'||cs[left] == 'u')
                cur --;
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

