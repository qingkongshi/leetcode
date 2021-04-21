package red.kea.leetcode.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author： KeA
 * @date： 2021-04-20 16:39:11
 * @version: 1.0
 * @describe: Z 字形变换
 *
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
 *
 * 比如输入字符串为 "PAYPALISHIRING"行数为 3 时，排列如下：
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 *
 *
 * 示例 1：
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 *
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 *
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * 示例 3：
 * 输入：s = "A", numRows = 1
 * 输出："A"
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 由英文字母（小写和大写）、',' 和 '.' 组成
 * 1 <= numRows <= 1000
 */
public class QuestionNo6 {

    public static String convert(String s, int numRows) {
        // 如果行数为1，则直接返回
        if (numRows == 1){
            return s;
        }
        // 创建numRows个集合
        List<List<Character>> list  = new ArrayList<>();
        for (int i = 0 ;i<numRows ; i++){
            List<Character> line = new ArrayList<>();
            list.add(line);
        }
        // 往返运动的脚标  也是行数
        int a = 0;

        // 方向 0 正向 1 反向
        int direction = 0 ;
        for (Character letter : s.toCharArray()){
            list.get(a).add(letter);

            if (direction == 0){
                a++;
            }
            if (direction == 1){
                a--;
            }
            if (a == 0){
                direction = 0;
            }
            if (a == numRows-1){
                direction = 1;
            }
        }
        StringBuffer sb = new StringBuffer();
        list.forEach(lines -> {
            lines.forEach(one->{
                sb.append(one);
            });
        });
        return sb.toString();
    }

    public static void main(String[] args) {
        String test = convert("ABCDE", 4);
        System.out.println(test);
    }
}
