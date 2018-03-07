package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @ClassName TwoSum.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2018年2月26日下午1:40:34
 * @Description Given an array of integers, return indices of the two numbers
 *              such that they add up to a specific target. You may assume that
 *              each input would have exactly one solution, and you may not use
 *              the same element twice. Example: Given nums = [2, 7, 11, 15],
 *              target = 9, Because nums[0] + nums[1] = 2 + 7 = 9, return [0,
 *              1].
 */

public class TwoSum {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = { 2, 7, 11, 15 };
        int[] result = twosum(nums, target);
        int[] result1 = twosum1(nums,target);
        int[] result2 = twosum2(nums,target);
        System.out.println("[" + result2[0] + "," + result2[1] + "]");
        System.out.println("[" + result1[0] + "," + result1[1] + "]");
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] twosum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static int[] twosum1(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - 1; i++)
            map.put(nums[i], i);
       
        
        for(int i = 0;i<nums.length;i++){
            int complement = target -nums[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                result[0] = i;
                result[1] = map.get(complement);
                break;
            }
        }
        return result;
    }
    public static int[] twosum2(int[] nums,int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                result[0] = map.get(complement);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
