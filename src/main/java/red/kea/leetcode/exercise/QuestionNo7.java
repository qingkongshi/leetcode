package red.kea.leetcode.exercise;

/**
 * @author： KeA
 * @date： 2021-04-21 13:54:55
 * @version: 1.0
 * @describe: 整数反转
 *
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 *
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 *
 * 示例 3：
 * 输入：x = 120
 * 输出：21
 *
 * 示例 4：
 * 输入：x = 0
 * 输出：0
 *
 * 提示：
 * -231 <= x <= 231 - 1
 */
public class QuestionNo7 {
    public static int reverse(int x) {
        StringBuffer stringBuffer = new StringBuffer(x+"");
        int m ;
        if (x<0){
            String substring ="-"+ stringBuffer.reverse().substring(0, stringBuffer.length() - 1);
            try {
                m = Integer.valueOf(substring);
            }catch (Exception e){
                m = 0;
            }
        }else{
            StringBuffer reverse = stringBuffer.reverse();
            try {
                m = Integer.valueOf(reverse.toString());
            }catch (Exception e){
                m = 0;
            }
        }
        return m;
    }

    public static int reverse2(int x) {
        int num = 0;
        while (x != 0){
            // 判断这个数是否超范围，如果超范围 *10之后会越界变为相反数，再/10 得到的数与之前不等
            if ((num*10)/10 != num){
                return 0;
            }
            num = num * 10 + x % 10;
            x = x/10;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(reverse2(2147483647));
    }
}
