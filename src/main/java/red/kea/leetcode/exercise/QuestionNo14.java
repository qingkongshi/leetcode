package red.kea.leetcode.exercise;

/**
 * @author： KeA
 * @date： 2021-04-28 09:56:42
 * @version: 1.0
 * @describe: 最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 * 提示：
 *
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 */
public class QuestionNo14 {
    public static String longestCommonPrefix(String[] strs){
        StringBuffer result = new StringBuffer();
        out:for (int i = 0 ;;i++){
            char temp = 'A';
            for (String str :strs){
                try{
                    str.charAt(i);
                }catch (Exception e){
                    break out;
                }
                if (temp=='A'){
                    temp = str.charAt(i);
                }
                if (temp != str.charAt(i)){
                    break out;
                }
            }
            result.append(temp);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"flower","","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
}
