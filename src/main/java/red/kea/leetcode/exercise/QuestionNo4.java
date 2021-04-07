package red.kea.leetcode.exercise;

import java.util.Arrays;

/**
 * @author： KeA
 * @date： 2021-04-07 17:11:59
 * @version: 1.0
 * @describe: 4.寻找两个正序数组的中位数
 * <p>
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1和nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * <p>
 * 示例 1：
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 * <p>
 * 示例 2：
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 * <p>
 * 示例 3：
 * 输入：nums1 = [0,0], nums2 = [0,0]
 * 输出：0.00000
 * <p>
 * 示例 4：
 * 输入：nums1 = [], nums2 = [1]
 * 输出：1.00000
 * <p>
 * 示例 5：
 * 输入：nums1 = [2], nums2 = []
 * 输出：2.00000
 * <p>
 * <p>
 * 提示：
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 * <p>
 * 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 */
public class QuestionNo4 {

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);
    }

    // 合并数组，排序，找到中位数
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, sum, 0, nums1.length);
        System.arraycopy(nums2, 0, sum, nums1.length, nums2.length);
        Arrays.sort(sum);
        if (sum.length % 2 == 0) {
            return (sum[(sum.length) / 2] + sum[(sum.length) / 2 - 1]) / 2.0d;
        } else {
            return sum[(sum.length - 1) / 2];
        }
    }

}
