package red.kea.leetcode.exercise;

/**
 * @author： KeA
 * @date： 2021-04-23 18:57:34
 * @version: 1.0
 * @describe: 整数转罗马数字
 *
 * 罗马数字包含以下七种字符：I，V，X，L，C，D和M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做II，即为两个并列的 1。12 写做XII，即为X+II。 27 写做XXVII, 即为XX+V+II。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
 *
 * I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
 * X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
 * C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1到 3999 的范围内。
 *
 * 示例1:
 * 输入:3
 * 输出: "III"
 *
 * 示例2:
 * 输入:4
 * 输出: "IV"
 *
 * 示例3:
 * 输入:9
 * 输出: "IX"
 *
 * 示例4:
 * 输入:58
 * 输出: "LVIII"
 * 解释: L = 50, V = 5, III = 3.
 *
 * 示例5:
 * 输入:1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * 提示：
 * 1 <= num <= 3999
 */
public class QuestionNo12 {
    //  I       II      III     IV      V       VI      VII     VIII    IX      X
    //  XI      XII     XIII    XIV     XV      XVI     XVII    XVIII   XIX     XX
    //  XXI     XXII    XXIII   XXIV    XXV     XXVI    XXVII   XXVIII  XXIX    XXX
    //  XXXI    XXXII   XXXIII  XXXIV   XXXV    XXXVI   XXXVII  XXXVIII XXXIX   XL
    //  XLI     XLII    XLIII   XLIV    XLV     XLVI    XLVII   XLVIII  XLIX    L
    //  LI      LII     LIII    LIV     LV      LVI     LVII    LVIII   LIX     LX
    //  LXI     LXII    LXIII   LXIV    LXV
    public static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuffer sb = new StringBuffer();
        for (int i = 0 ;i<values.length;i++){
            while (values[i]<=num){
                num = num - values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(108));
    }
}
