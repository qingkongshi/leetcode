package red.kea.leetcode.exercise;

/**
 * @author： KeA
 * @date： 2021-04-22 15:25:58
 * @version: 1.0
 * @describe: 回文数
 *
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 * 示例 1：
 * 输入：x = 121
 * 输出：true
 *
 * 示例2：
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 示例 3：
 * 输入：x = 10
 * 输出：false
 * 解释：从右向左读, 为 01 。因此它不是一个回文数。
 * 示例 4：
 *
 * 输入：x = -101
 * 输出：false
 *
 * 提示：
 * -2^31<= x <= 2^31- 1
 *
 */
public class QuestionNo9 {
    public static boolean isPalindrome(int x) {
        if (x<0) return false;
        int num = 0;
        int temp = x;
        while (temp != 0){
            if (num * 10 / 10 != num){
                return false;
            }
            num = num * 10 + temp % 10;
            temp = temp / 10;
        }
        return num == x;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
