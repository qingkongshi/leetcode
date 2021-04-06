package red.kea.leetcode.exercise;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author： KeA
 * @date： 2021-04-02 18:01:52
 * @version: 1.0
 * @describe: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 示例 4:
 * 输入: s = ""
 * 输出: 0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class QuestionNo3 {

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring1("abcabcbb");
        System.out.println(i);
    }

    //使用双重for循环，从第一位往后依次取字符串，看该字符串时候含有下一个字符
    public static int lengthOfLongestSubstring1(String s) {
        if (s.length() == 0) {
            return 0;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i + 1; count < s.length() - i; count++, j++) {
                //执行到最后一位，未发现重复字符
                if (j==s.length()){
                    arrayList.add(j - i);
                    break;
                }
                //未执行的最后一位，判断当前字符串时候包含下一位
                if (s.substring(i, j).contains(s.substring(j, j + 1))) {
                    arrayList.add(j - i);
                    break;
                }
            }
        }
        //取最大值
//        Integer max = Collections.max(arrayList);
        Integer max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }
        return max;
    }
}
