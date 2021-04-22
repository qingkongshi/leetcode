package red.kea.leetcode.exercise;

/**
 * @author： KeA
 * @date： 2021-04-22 16:45:57
 * @version: 1.0
 * @describe: 盛最多水的容器
 */
public class QuestionNo11 {
    /**
     * 理论上应该是没问题的。但是在力扣上跑的时候，一个很大的数组导致超出运算时长
     * 尝试一下官方的双指针算法
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0 ; i< height.length ; i++){
            for (int j = i ; j<height.length ; j++){
                int min = Math.min(height[i], height[j]);
                max = Math.max(max ,min * Math.abs(j - i ));
            }
        }
        return max;
    }

    /**
     * 官网提供的思路
     * @param height
     * @return
     */
    public static int maxArea2(int[] height){
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left<right){
            max = Math.max(max , Math.min(height[left],height[right]) * (right-left));
            if (height[left] > height[right]){
                right--;
            }else {
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea2(height));
    }
}
