package red.kea.leetcode.exercise;

import java.util.HashMap;
import java.util.Map;

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

    // 评论区给出神奇解法
    public static int romanToInt2(String s){
        s = s.replace("CM","a");
        s = s.replace("CD","b");
        s = s.replace("XC","c");
        s = s.replace("XL","d");
        s = s.replace("IX","e");
        s = s.replace("IV","f");
        Map<Character,Integer> com = new HashMap<>();
        com.put('M',1000);
        com.put('a',900);
        com.put('D',500);
        com.put('b',400);
        com.put('C',100);
        com.put('c',90);
        com.put('L',50);
        com.put('d',40);
        com.put('X',10);
        com.put('e',9);
        com.put('V',5);
        com.put('f',4);
        com.put('I',1);
        int result = 0;
        for (char ch:s.toCharArray()){
            result = result + com.get(ch);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt2("MCMXCIV"));
    }
}
