package red.kea.leetcode.other;

import java.util.Arrays;

/**
 * @author： KeA
 * @date： 2021-12-02 16:24:37
 * @version: 1.0
 * @describe: 贪心算法
 */
public class GreedyAlgorithm {

    /**
     * 问题1
     *
     * 有一群孩子和一堆饼干，每个孩子有一个解饿度，每个饼干有一个大小。
     * 每个孩子只能吃最多一个饼干，且只有饼干的大小大于孩子的饥饿度时，
     * 这个孩子才能吃饱。求解最多有多少个孩子能够吃饱
     *
     * 输入输出样例
     * 输入   孩子饥饿度  1，2
     *       饼干大小    1，2，3
     * 输出             2
     *
     */


    public static Integer question1(){
        Integer[] children = {1,2};
        Integer[] cookies = {1,2,3};
        Arrays.sort(children);
        Arrays.sort(children);
        //能吃饱孩子的个数
        int child = 0 ;
        //第几个饼干
        int cookie = 0;
        while (child < children.length && cookie <cookies.length){
            if (children[child]<cookies[cookie++]){
                child++;
            }
        }
        return child;
    }

    public static void main(String[] args) {
        System.out.println(question1());
    }

}
