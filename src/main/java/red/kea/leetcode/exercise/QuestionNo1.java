package red.kea.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author： KeA
 * @date： 2021-04-02 13:29:44
 * @version: 1.0
 * @describe:
 *
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 *
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 *
 * 提示：
 *
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 */
public class QuestionNo1 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        int[] ints = twoSum(nums, target);
        int[] ints = twoSum1(nums, target);
        for (int index : ints){
            System.out.println(index);
        }
    }

    //双重for循环 时间复杂度O(n²)
    public static int[] twoSum(int[] nums, int target) {
        for(int i =0 ;i<nums.length;i++){
            for (int j = 0 ; j<nums.length ; j++){
                if (i==j){
                    continue;
                }
                if (nums[i]+nums[j] ==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // 利用map将数组的值作为键，下标作为值。
    // 判断目标值减去当前值是否已存在map中，
    // 若不存在，则存入map，
    // 若存在，取出目标值与当前值之差的下标，和当前值的下标
    // 时间复杂度O(n)
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
