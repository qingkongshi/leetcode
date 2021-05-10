package red.kea.leetcode.exercise;

/**
 * @author： KeA
 * @date： 2021-05-07 20:13:36
 * @version: 1.0
 * @describe: 最接近的三数之和
 *
 * 给定一个包括n 个整数的数组nums和 一个目标值target。找出nums中的三个整数，使得它们的和与target最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 示例：
 *
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 *
 * 提示：
 *
 * 3 <= nums.length <= 10^3
 * -10^3<= nums[i]<= 10^3
 * -10^4<= target<= 10^4
 */
public class QuestionNo16 {
    public static int threeSumClosest(int[] nums, int target) {

        return 1;
    }

    public static void main(String[] args) {

        int[] nums = {-1,2,1,-4};
        int target = 1;
        int i = threeSumClosest(nums, target);
        System.out.println(i);
    }
}
