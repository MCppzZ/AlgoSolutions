/*
 * You are a professional robber planning to rob houses 
 * along a street. Each house has a certain amount of 
 * money stashed, the only constraint stopping you from 
 * robbing each of them is that adjacent houses have 
 * security system connected and it will automatically 
 * contact the police if two adjacent houses were 
 * broken into on the same night.

 * Given a list of non-negative integers representing 
 * the amount of money of each house, determine the 
 * maximum amount of money you can rob tonight without 
 * alerting the police.
 */

public class HouseRobber {

    public int rob(int[] num) {
        if (num.length == 0)
            return 0;
        if (num.length == 1)
            return num[0];
        if (num.length == 2)
            return Math.max(num[0], num[1]);
        int pre = num[0];
        int result = Math.max(num[0], num[1]);
        for (int i = 2; i < num.length; i++) {
            int tmp = result;
            result = Math.max(result, pre + num[i]);
            pre = tmp;
        }
        return result;
    }
    
}
