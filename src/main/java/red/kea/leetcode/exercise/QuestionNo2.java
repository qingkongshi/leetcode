package red.kea.leetcode.exercise;

import java.math.BigInteger;

/**
 * @author： KeA
 * @date： 2021-04-02 14:52:57
 * @version: 1.0
 * @describe:
 * 2. 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *
 * 示例 1：
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 *
 * 示例 2：
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 *
 * 示例 3：
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *
 * 提示：
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */
public class QuestionNo2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(9)));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4,new ListNode(9))));
        ListNode l3 = addTwoNumbers(l1,l2);
//        ListNode l3 = addTwoNumbers2(l1,l2);
        System.out.println(l3);

    }
    // 使用递归
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        if (l1==null&&l2==null){
            return null;
        }
        if (l1==null){
            l1 = new ListNode(0);
        }
        if (l2==null){
            l2 = new ListNode(0);
        }
        if(l1.val+l2.val>9){
            if (l1.next==null){
                l1.next = new ListNode(1);
            }else{
                l1.next.val++;
            }
            l3.val = l1.val+l2.val -10;
        }else{
            l3.val = l1.val+l2.val;
        }

        l3.next = addTwoNumbers(l1.next,l2.next);
        return l3;
    }
    // 将链表准换为整数，相加后，再转回链表
    // 投机过的，但是不能算
    // 但是！！力扣的测试方法中有特大链表，int和long都不能存下，同时还不支持BigInteger。
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        while (true){
            sb1.append(l1.val);
            if (l1.next!=null){
                l1 = l1.next;
            }else{
                break;
            }
        }
        while (true){
            sb2.append(l2.val);
            if (l2.next!=null){
                l2 = l2.next;
            }else{
                break;
            }
        }
        String s = BigInteger.valueOf(Long.valueOf(sb1.reverse().toString())).add(BigInteger.valueOf(Long.valueOf(sb2.reverse().toString()))).toString();
        StringBuffer sum = new StringBuffer(s);
        ListNode listNode = new ListNode();
        for(int i = 0 ;i<sum.length()-1;i++){
            ListNode listNode1 = new ListNode();
            listNode.val = Integer.valueOf(sum.substring(i,i+1));
            listNode1.next = listNode;
            listNode = listNode1;
        }
        listNode.val = Integer.valueOf(sum.substring(sum.length()-1,sum.length()));
        return listNode;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
