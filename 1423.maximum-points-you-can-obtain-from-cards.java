/*
 * @lc app=leetcode.cn id=1423 lang=java
 * @lcpr version=30204
 *
 * [1423] 可获得的最大点数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class MySolution { // 回溯法，递归左右，但是会超时。做题前记得看一下数组长度，这里是10^5次方，不要用这种回溯递归类型的了
    public int maxScore(int[] cardPoints, int k) {
        return cal(cardPoints, 0, cardPoints.length-1, k);
    }

    private int cal(int[] cardPoints,int left,int right,int k){
        if(k<=0)
            return 0;
        int res1 = cal(cardPoints, left+1, right, k-1)+cardPoints[left];
        int res2 = cal(cardPoints, left, right-1, k-1)+cardPoints[right];

        return Math.max(res1, res2);
    }
}

class Solution{ // 看完一些思路后我写的笨蛋方法
    public int maxScore(int[] cardPoints, int k){
        long res = Integer.MAX_VALUE;
        int right = 0;
        long sum = 0;
        long cur = 0;
        int len = cardPoints.length;
        int r = len-k;
        if(r<=0){
             for(;right<len;right++){
                sum+=cardPoints[right];
             }
             return (int)sum;
            }

        for(;right<len;right++){
            sum+=cardPoints[right];
            cur += cardPoints[right];
            int left = right-r+1;
            if(left<0)
                continue;
            res = Math.min(cur,res);
            cur-=cardPoints[left];
        }
        return (int)(sum-res);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6,1]\n3\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// [9,7,7,9,7,7,9]\n7\n
// @lcpr case=end

// @lcpr case=start
// [1,1000,1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,79,80,1,1,1,200,1]\n3\n
// @lcpr case=end

 */

