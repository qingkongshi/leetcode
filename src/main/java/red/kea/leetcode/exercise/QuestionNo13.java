package red.kea.leetcode.exercise;

/**
 * @author： KeA
 * @date： 2021-04-27 13:20:11
 * @version: 1.0
 * @describe: 罗马数字转整数
 */
public class QuestionNo13 {
    public static int romanToInt(String s) {
        int[] values = {1000,500,100,50,10,5,1};
        char[] roman = {'M','D','C','L','X','V','I'};
        int num = 0;
        int mark = 1000;
        int dev = 0;
        for (char ch : s.toCharArray()){
            for (int i = 0 ;i<roman.length;i++){
                if (ch == roman[i]){
                    if (values[i]>mark){
                        dev = values[i] - mark*2;
                        mark = values[i];
                        num =  num + dev;
                    }else{
                        mark = values[i];
                        num = num + mark;
                    }
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
